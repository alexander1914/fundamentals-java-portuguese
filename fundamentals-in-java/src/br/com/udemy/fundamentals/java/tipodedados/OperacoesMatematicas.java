package br.com.udemy.fundamentals.java.tipodedados;
public class OperacoesMatematicas {
    public static void main(String[] args) {
        //TODO: Operações matemáticas(+,-,/,*)
        int a = 10, b = 100, resultado;
        float resultado2 = 0;

        //SOMA
        resultado = a + b;
        System.out.println("Soma de: " + a +" + "+ b +" = " + resultado);

        //SUBTRAÇÃO
        resultado = a - b;
        System.out.println("Soma de: " + a +" - "+ b +" = " + resultado);

        //MULTIPLICAÇÃO
        resultado = a * b;
        System.out.println("Soma de: " + a +" * "+ b +" = " + resultado);

        //DIVISÃO
        resultado = a / b;
        System.out.println("Soma de: " + a +" / "+ b +" = " + resultado);

        //MÓDULO
        resultado = a % 2;
        System.out.println("O resto da divisão de : " + a + " por 2 é " + resultado2);

    }
}
