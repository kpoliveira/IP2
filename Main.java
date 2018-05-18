package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("INFORME O DOCUMENTO QUE DESEJA ABRIR");
        String texto = input.nextLine();
        System.out.println("INFORME O SEGUNDO DOCUMENTO");
        String texto2 = input.nextLine();

        String alo = "oi";
        String alo2 = "oi";

        try{
            FileReader arq = new FileReader(texto);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            alo = linha;
            System.out.println(linha);
            arq.close();

            FileReader arq2 = new FileReader(texto2);
            BufferedReader lerArq2 = new BufferedReader(arq2);
            String linha2 = lerArq2.readLine();
            alo2 = linha2;
            System.out.println(linha2);
            arq2.close();

        }catch(IOException e){
            System.out.println("ERRO NA ABERTURA DO ARQUIVO");
            e.getMessage();
        }


        String palavras[] = alo.split(" ");
        String palavras2[] = alo2.split(" ");

        int i, q, contador = 0;
        double idf = 0;
        double tfidf = 0;

        for (i = 0; i < palavras.length; i++){
            contador = 0;
            for(q = 0; q < palavras2.length; q++){

                if(palavras[i].equals(palavras2[q])){

                    contador++;
                    idf = Math.log10(2/1);
                    tfidf = contador * idf;
                    System.out.println("'" + palavras[i] + " ': " + tfidf);

                }
            }
        }
    }
}