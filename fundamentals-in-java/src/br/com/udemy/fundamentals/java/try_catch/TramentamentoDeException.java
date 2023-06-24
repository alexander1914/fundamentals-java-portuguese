package br.com.udemy.fundamentals.java.try_catch;

import java.io.IOException;
import java.util.Scanner;

public class TramentamentoDeException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o n1: ");
        int n1 = entrada.nextInt();

        System.out.println("Informe o n2: ");
        int n2 = entrada.nextInt();

        try {
            System.out.println(divisao(n1, n2));
        }catch (ArithmeticException e){
            System.out.println("Não consegui dividir os valores: " + n1 + " / "+ n2);
        }catch (IOException e){
            System.out.println("Ocorreu uma outra exceção...");
        }
        entrada.close();
    }
    //TODO: Estou criando uma função, que avisa que tem possibilidade de lançar
    // uma exceção do tipo Exception

    //TODO: Throws: lança uma exceção do tipo IOException
    public static int divisao(int num1, int num2) throws IOException {
        return num1 / num2;
    }
}
