package br.com.udemy.fundamentals.java.funcoes;

import java.util.Scanner;
public class Funcoes {
    //TODO: Variaveis globais

    //TODO: Static: quando temos uma função com a declaração static,
    // as variaveis também devem ser definidas com static
    static String frutas[];
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int qtdFrutas;
        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtdFrutas = Integer.parseInt(teclado.nextLine());

        //TODO: Executando a minha função
        cadastrarDados(qtdFrutas);
        mostrarDados(qtdFrutas);

        teclado.close();
    }

    //TODO: Uma função deve ter os seguintes requisitos:
    //TODO: a) Tipo de retorno - Tipo de dado que a função vai retornar
    //      b) Nome - Corresponde a ação que a função realiza
    //      c) Parâmetros/Argumentos de Entrada(Opcional)
    //      d) Retorno(Opcional - depende do tipo de retorno)
    static void cadastrarDados(int quantidade){
        //TODO: Definindo o tamanho do vetor pela quantidade
        frutas = new String[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.println("Informe a " + (i + 1) + " fruta: ");
            frutas[i] = teclado.nextLine();
        }
    }
    static void mostrarDados(int quantidade){
        for (int i = (quantidade - 1); i >= 0; i--){
            System.out.println(frutas[i]);
        }
    }
}
