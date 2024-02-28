package com.example;

import com.example.sorts.BubbleSort;
import com.example.sorts.InsertionSort;
import com.example.sorts.SelectionSort;
import com.example.sorts.calc.SortTimeCalc;

public class Main {
      public static void main(String[] args) {

        //Instancia a classe responsável por gerar os vetores com as entradas
        ArrayGenerator arr = new ArrayGenerator();

        // Gera os arrays
        int[][] arrays = arr.generateArrays();


/*
        Instancio a classe responsavel pelo calculo do tempo passando
        os arrays e a uma instancia do algoritmo de sort que quero executar
*/

        //Insertion sort
        SortTimeCalc insertionSortTime = new SortTimeCalc(
        arrays,
        new InsertionSort()
        );
        insertionSortTime.calcularTempo();
        insertionSortTime.exibirTabelas("Insertion");

        //Bubble sort
        SortTimeCalc bubbleSortTime = new SortTimeCalc(
        arrays,
        new BubbleSort()
        );
        bubbleSortTime.calcularTempo();
        bubbleSortTime.exibirTabelas("Bubble");

        //Selection sort
        SortTimeCalc selectionSortTime = new SortTimeCalc(
        arrays, 
        new SelectionSort()
        );
        selectionSortTime.calcularTempo();
        selectionSortTime.exibirTabelas("Selection");

    }
}