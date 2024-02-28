package com.example.sorts;

public class SelectionSort implements ISort {
    
    @Override
    public int[] sort(int[] array){

        int tamanhoArray = array.length;

        for(int i = 0; i<= tamanhoArray-1; i++){
            
            int indexMenor = i;

            for(int j = i+1; j <=  tamanhoArray-1; j++){
                if(array[j] < array[indexMenor]){
                    indexMenor = j;
                }
            }
            array[i] = array[indexMenor];
            
        }

        return array;
    }

}
