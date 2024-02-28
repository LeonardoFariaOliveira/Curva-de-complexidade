package com.example.sorts.calc;

import java.util.ArrayList;
import java.util.List;
import com.example.sorts.ISort;

public class SortTimeCalc implements ICalc {

    //Lista dos tempos medios de execução de cada vetor ao executar 30 vezes
    public List<Double> tabelaTempo;

    //Lista com o tamanho das entradas usadas na medição de tempo
    public List<Integer> tabelaTamanho;

    //Array que será usado
    public int[][] arrays;

    //Classe que receberá a instancia do algoritmo para ordenar
    public ISort sort;

    
    public SortTimeCalc(
        int[][] _arrays,
        ISort _sort
    ){
        this.tabelaTamanho = new ArrayList<>();
        this.tabelaTempo = new ArrayList<>();
        this.arrays = _arrays;
        this.sort = _sort;
    }
/*
    Função que irá calcular o tempo com base em:
        -Na subtração do tempo inicial - final
        -Na media dos tempos de cada vetor
*/
    @Override
    public void calcularTempo(){
        
        //20 é relativo aos vetores (100.000 / 5000 = 20)
        for (int i = 0; i < 19; i++) {

            double somaTempoTotal = 0;
           
            for(int j = 0; j < 30; j++){

                var tempoInicio = System.currentTimeMillis();
                this.sort.sort(this.arrays[i]);
                var tempoFim = System.currentTimeMillis();
                var tempoTotal = tempoFim - tempoInicio;
                somaTempoTotal = (somaTempoTotal + tempoTotal);
            
            }

            double mediaTempoTotal = somaTempoTotal / 30;

            this.tabelaTempo.add(i, mediaTempoTotal);
            this.tabelaTamanho.add(this.arrays[i].length);
            
        }

    }

    @Override
    public void exibirTabelas(String sortName){
            
        System.out.println("### "+ sortName +" sort ###" );
        System.out.println("Entrada - Media de tempo" );

        for(int c=0; c<19; c++){
            
            System.out.print(this.tabelaTamanho.get(c));
            System.out.print(" - " );
            System.out.printf("%.2f %n", 
            this.tabelaTempo.get(c));
            
        }
        
    }
}
