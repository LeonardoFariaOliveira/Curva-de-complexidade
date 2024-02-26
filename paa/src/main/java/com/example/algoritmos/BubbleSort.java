package com.example.algoritmos;

public class BubbleSort {
    
    public int[] sort(int[] array){

        int tamanhoArray = array.length;

        for(int i = 0; i<= tamanhoArray; i++){
            for(int j = 0; j < tamanhoArray - i - 1; j++){
                if(array[j] > array[j+1]){
                    array[j+1] = array[j];
                }
            }
        }

        return array;
    }

}
