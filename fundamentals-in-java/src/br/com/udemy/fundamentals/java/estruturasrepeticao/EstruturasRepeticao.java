package br.com.udemy.fundamentals.java.estruturasrepeticao;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        //TODO: Estruturas de repetição são para fazer laços de repetições

        int idade = 1;
        String nome;

        //Scanner: para receber dados do teclado
        Scanner teclado = new Scanner(System.in);

        //TODO: While é tipo estrutura de repetição sempre checa o valor antes de entrar
        while (idade > 0){
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome +" tem "+ idade + " anos");

            //Para encerrar o bloco do while
            break;
        }

        // TODO: Do while primeiro segue as instruções e depois valida com while a condição
        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome +" tem "+ idade + " anos");

            //Para encerrar o bloco do while
            break;

        }while (idade > 0);


        //TODO: For é uma estrutura de repetição com condição de parada e forma de incremento
        for (int i = 0; i < 5; i++){
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0){
                System.out.println(nome +" tem "+ idade + " anos");
            }
        }

        teclado.close();
    }
}
