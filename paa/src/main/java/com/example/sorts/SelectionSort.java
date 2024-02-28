package com.example.sorts;

public class SelectionSort implements ISort {
    
    @Override
    public int[] sort(int[] array){

        //recebo o tamanho do array
        int tamanhoArray = array.length;

        //percorro o array passado como parametro
        for(int i = 0; i<= tamanhoArray-1; i++){
            
            //recebo o index com o menor valor sendo o valor que estou atualmente
            int indexMenor = i;

/*
            Inicializo o laço que vai verificar com:
              - j sendo o i atual + 1
              - j sendo menor que o tamanho do array - 1
              - incremento j

            Se o elemento do vetor na posição j for menor que o index do menor valor,
            quer dizer que o menor valor até agora é o elemento do vetor na posição j
            então atualizo o valor do menor index

            realizo esse procedimento no vetor todo e depois desloco pois ao final de
            cada operação, a primeira posição terá o menor valor
 
*/
            for(int j = i+1; j <=  tamanhoArray-1; j++){
                if(array[j] < array[indexMenor]){
                    indexMenor = j;
                }
            }
            //Passo o menor valor para posições iniciais
            array[i] = array[indexMenor];
            
        }

        return array;
    }

}
