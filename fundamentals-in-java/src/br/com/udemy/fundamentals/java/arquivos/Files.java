package br.com.udemy.fundamentals.java.arquivos;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
            PrintStream escrever = new PrintStream(
                    new FileOutputStream("saida.txt",true));
            for (int i = 0; i < 5; i++){
                System.out.println("Escreva algo:");
                String mensagem = teclado.nextLine();
                escrever.println(mensagem);
            }
            escrever.close();
        }catch (FileNotFoundException ex){
            System.out.println("Não foi possível criar o arquivo.");
        }
        teclado.close();
    }
}
