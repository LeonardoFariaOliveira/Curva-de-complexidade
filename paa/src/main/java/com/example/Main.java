package com.example;

import java.io.IOException;

import com.example.sorts.BubbleSort;
import com.example.sorts.InsertionSort;
import com.example.sorts.SelectionSort;
import com.example.sorts.calc.SortTimeCalc;

public class Main {
      public static void main(String[] args) throws IOException {

        //Instancia a classe responsável por gerar os vetores com as entradas
        ArrayGenerator arr = new ArrayGenerator();

        String caso = "pior";

        // Gera os arrays
        Integer[][] arrays = arr.generateArrays(caso);

        


/*
        Instancio a classe responsavel pelo calculo do tempo passando
        os arrays e a uma instancia do algoritmo de sort que quero executar
*/

        //Insertion sort
        // SortTimeCalc insertionSortTime = new SortTimeCalc(
        // arrays,
        // new InsertionSort()
        // );
        // insertionSortTime.calcularTempo(caso);
        // insertionSortTime.gerarCsvTempoMedio(caso+"_caso");
        // insertionSortTime.gerarCsvTempoVetor(caso+"_caso");

        //Bubble sort
        // SortTimeCalc bubbleSortTime = new SortTimeCalc(
        // arrays,
        // new BubbleSort()
        // );
        // bubbleSortTime.calcularTempo(caso);
        // bubbleSortTime.gerarCsvTempoMedio(caso+"_caso");
        // bubbleSortTime.gerarCsvTempoVetor(caso+"_caso");

        //Selection sort
        SortTimeCalc selectionSortTime = new SortTimeCalc(
        arrays, 
        new SelectionSort()
        );
        selectionSortTime.calcularTempo(caso+"_caso");
        selectionSortTime.gerarCsvTempoMedio(caso+"_caso");
        selectionSortTime.gerarCsvTempoVetor(caso+"_caso");

    }
}