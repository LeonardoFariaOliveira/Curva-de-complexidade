package com.example;

import com.example.algoritmos.BubbleSort;
import com.example.algoritmos.InsertionSort;
import com.example.algoritmos.SelectionSort;

public class Main {
      public static void main(String[] args) {

        ArrayGenerator arr = new ArrayGenerator();
        InsertionSort insertionSort = new InsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();

        // Gera os 30 arrays
        int[][] arrays = arr.generateArrays();

        for (int i = 0; i < 30; i++) {
            
            insertionSort.sort(arrays[i]);
            
        }

        for (int i = 0; i < 30; i++) {
            
            bubbleSort.sort(arrays[i]);
            
        }

        for (int i = 0; i < 30; i++) {
            
            selectionSort.sort(arrays[i]);
            
        }

        System.out.println("terminei");

    }
}