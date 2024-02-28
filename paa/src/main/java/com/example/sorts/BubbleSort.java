package com.example.sorts;

public class BubbleSort implements ISort {
    
    @Override
    public int[] sort(int[] array){

        //recebo o tamanho total do array
        int tamanhoArray = array.length;

/*
        Nesse algoritmo o array é percorrido várias vezes para verificar se realmente está
        na ordem correta. A cada iteração o valor limite do laço diminui, assim fazendo
        uma verificação completa
*/

        //percorro o array
        for(int i = 0; i<= tamanhoArray; i++){
            //começando do zero e indo até o tamanho menos o i - 1
            for(int j = 0; j < tamanhoArray - i - 1; j++){
                //se o elemento na posição j for maior que o proximo eu faço o swap
                if(array[j] > array[j+1]){
                    array[j+1] = array[j];
                }
            }
        }

        return array;
    }

}
