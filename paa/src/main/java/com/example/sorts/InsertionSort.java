package com.example.sorts;

public class InsertionSort implements ISort {

    @Override
    public int[] sort(int[] array) {

        //recebe o tamanho do array
        int tamanhoArray = array.length;

        //inicializa as variavei key e j como 0
        int key, j = 0;

        //contador para percorrer todos os elementos do array
        for(int i=0; i< tamanhoArray; i++){

            //variavel key recebe o elemento atual do vetor
            key = array[i];
            //variavel j recebe contador menos 1
            j = i - 1;

            //enquanto a variavel j for maior que 0 e 
            //o elemento do array na posição anterior for maior que a chave(elemento atual)
            while(j >= 0 && array[j] > key){
                //faço um swap (troco o elemento da posição anterior com o elemento atual)
                array[j+1] = array[j];

                //atualizo a variavel j para recebe j - 1
                j = j -1;
            }

            //o proximo elemento recebe a chave
            array[j+1] = key;

        }     

        //retorna o array ordenado
        return array;
    
    }
}
