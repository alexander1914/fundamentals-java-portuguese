package br.com.udemy.fundamentals.java.funcoes;

import java.util.Scanner;

public class Funcoes2 {
    public static void main(String[] args) {
        int salario;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por gentileza informe seu salário: ");
        salario = Integer.parseInt(teclado.nextLine());

        System.out.println("Meu salário será: " + meuDizimo(salario));
        System.out.println("O Autor desta função foi o " + autor());
    }

    //TODO: Exemplo de função com retorno
    static double meuDizimo(int valor){
        double porcentagem = 10.0 / 100.0;
        double resultado;

        resultado = valor - (porcentagem * valor);

        return resultado;
    }
    static String autor(){
        return "Alexander Albuquerque Oliveira";
    }
}
