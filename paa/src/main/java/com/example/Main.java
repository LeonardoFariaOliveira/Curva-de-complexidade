package com.example;

import com.example.sorts.BubbleSort;
import com.example.sorts.InsertionSort;
import com.example.sorts.SelectionSort;
import com.example.sorts.times.BubbleSortTime;
import com.example.sorts.times.InsertionSortTime;
import com.example.sorts.times.SelectionSortTime;

public class Main {
      public static void main(String[] args) {

        ArrayGenerator arr = new ArrayGenerator();

        // Gera os 30 arrays
        int[][] arrays = arr.generateArrays();

        //Insertion sort
        InsertionSortTime insertionSortTime = new InsertionSortTime(
            arrays, new InsertionSort()
        );
        insertionSortTime.calcularTempo();
        insertionSortTime.exibirTabelas();

        //Bubble sort
        BubbleSortTime bubbleSortTime = new BubbleSortTime(
            arrays, new BubbleSort()
        );
        bubbleSortTime.calcularTempo();
        bubbleSortTime.exibirTabelas();

        //Selection sort
        SelectionSortTime selectionSortTime = new SelectionSortTime(
            arrays, new SelectionSort()
        );
        selectionSortTime.calcularTempo();
        selectionSortTime.exibirTabelas();

        
        
      

    }
}