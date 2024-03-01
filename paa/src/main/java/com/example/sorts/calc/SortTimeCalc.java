package com.example.sorts.calc;

import java.util.ArrayList;
import java.util.List;

import com.example.sorts.ISort;
import com.opencsv.CSVWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SortTimeCalc implements ICalc {

    //Lista dos tempos medios de execução de cada vetor ao executar 30 vezes
    public List<Double> tabelaTempo;

    //Lista dos tempos medios de execução de cada vetor ao executar 30 vezes
    public Double[][] tabelaTempoTotal;

    //Lista com o tamanho das entradas usadas na medição de tempo
    public List<Integer> tabelaTamanho;

    //Array que será usado
    public Integer[][] arrays;


    //Classe que receberá a instancia do algoritmo para ordenar
    public ISort sort;

    public SortTimeCalc(
        Integer[][] _arrays,
        ISort _sort
    ){
        this.tabelaTamanho = new ArrayList<>();
        this.tabelaTempo = new ArrayList<>();
        this.tabelaTempoTotal = new Double[19][30];
        this.arrays = _arrays;
        this.sort = _sort;
    }
/*
    Função que irá calcular o tempo com base em:
        -Na subtração do tempo inicial - final
        -Na media dos tempos de cada vetor
*/
    @Override
    public void calcularTempo(String caso){
        

        for (int i = 0; i < 19; i++) {

            double somaTempoTotal = 0;
           
            for(int j = 0; j < 30; j++){

                var tempoInicio = System.currentTimeMillis();
                this.sort.sort(this.arrays[i], caso);
                var tempoFim = System.currentTimeMillis();
     
                var tempoTotal = tempoFim - tempoInicio;
               
              
                somaTempoTotal = (somaTempoTotal + tempoTotal);

                tabelaTempoTotal[i][j] = (double) tempoTotal;
      
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

    public void gerarCsvTempoMedio(String caso) throws IOException{
            
        String[] cabecalho = {"Tamanho", "Media de tempo"};
        List<String[]> linhas = new ArrayList<>();

       
        for(int c=0; c<19; c++){
            
            linhas.add(new String[]
            {tabelaTamanho.get(c).toString(),
            tabelaTempo.get(c).toString()}
            );
           
        }

        Writer writer = Files.newBufferedWriter(Paths.get(caso+"_tamanho_tempo.csv"));
        try (CSVWriter csvWriter = new CSVWriter(writer)) {
            csvWriter.writeNext(cabecalho);
            csvWriter.writeAll(linhas);

            csvWriter.flush();
        }

        writer.close();
        
    }


    public void gerarCsvTempoVetor(String caso) throws IOException{
            
        String[] cabecalho = {"Tamanho", "Tempo total"};
        List<String[]> linhas = new ArrayList<>();

       
        for(int c=0; c<19; c++){
            
            for(int d=0; d<30; d++){
            
                linhas.add(new String[]
                {tabelaTamanho.get(c).toString(), 
                tabelaTempoTotal[c][d].toString()}
                );
               
            }
           
        }

        Writer writer = Files.newBufferedWriter(Paths.get(caso+"_tamanho_vetor.csv"));
        try (CSVWriter csvWriter = new CSVWriter(writer)) {
            csvWriter.writeNext(cabecalho);
            csvWriter.writeAll(linhas);

            csvWriter.flush();
        }

        writer.close();
        
    }


}
