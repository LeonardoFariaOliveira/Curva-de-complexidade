package com.example;

import java.util.Arrays;
import java.util.Collections;

public class ArrayGenerator {

    public Integer[] shuffleArray(Integer[] array){

        var list = Arrays.asList(array);
        Collections.shuffle(list);
        Integer[] arrayEmbaralhado = list.toArray(new Integer[0]);
        return arrayEmbaralhado;

    }

    //Função que gera os 30 arrays em ordem decrescente
    public Integer[][] generateArrays(String s) {

        //declara variável que irá receber os arrays
        Integer[][] arrays = new Integer[19][];


        //Laço de repetição que popula os arrays
        for (int i = 0, size = 10000; size <= 100000; i++, size += 5000) {

            // Cria um array de tamanho 'size' com valores em ordem decrescente
            arrays[i] = new Integer[size];
            for (int j = 0; j < size; j++) {
                arrays[i][j] = size - j - 1;
            }

            if(s.equals("medio")){
                ArrayGenerator arr = new ArrayGenerator();
                arrays[i] = arr.shuffleArray(arrays[i]);
            }

        }

        return arrays;
        
    }
}
