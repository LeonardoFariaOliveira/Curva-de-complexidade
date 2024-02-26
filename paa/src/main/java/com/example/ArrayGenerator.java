package com.example;

public class ArrayGenerator {

    //Função que gera os 30 arrays em ordem decrescente
    public int[][] generateArrays() {

        //declara variável que irá receber os arrays
        int[][] arrays = new int[30][];

        //Laço de repetição que popula os arrays
        for (int i = 0, size = 1000; i < 30; i++, size += 5000) {

            // Cria um array de tamanho 'size' com valores em ordem decrescente
            arrays[i] = new int[size];
            for (int j = 0; j < size; j++) {
                arrays[i][j] = size - j - 1;
            }
        }

        return arrays;
        
    }
}
