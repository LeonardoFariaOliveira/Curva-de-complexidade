package com.example.sorts;

import java.util.Arrays;

public class InsertionSort implements ISort {

    @Override
    public void sort(Integer[] array, String caso) {


        //recebe o tamanho do array
        int tamanhoArray = array.length;

        Integer[] newArray = Arrays.copyOf(array, array.length);

        //inicializa as variavei key e j como 0
        int key, j = 0;

        //contador para percorrer todos os elementos do array
        for(int i=0; i< tamanhoArray; i++){

            //variavel key recebe o elemento atual do vetor
            key = newArray[i];
            //variavel j recebe contador menos 1
            j = i - 1;

            //enquanto a variavel j for maior que 0 e 
            //o elemento do newArray na posição anterior for maior que a chave(elemento atual)
            while(j >= 0 && newArray[j] > key){
                //faço um swap (troco o elemento da posição anterior com o elemento atual)
                newArray[j+1] = newArray[j];
               
                //atualizo a variavel j para recebe j - 1
                j = j -1;
            }

            //o proximo elemento recebe a chave
            newArray[j+1] = key;

        }     

    
    }
}
