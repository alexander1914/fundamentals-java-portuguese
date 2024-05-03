package br.com.udemy.fundamentals.java.recursos_avancado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TODO: Expressões Lambdas: são funções anônimas ->
public class Lambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Alexander");
        palavras.add("Oliveira");
        palavras.add("Vargas");

        palavras.sort(comparador);

        //TODO: Implementando uma expressão lambda in Java
        // Forma 1
        // o parâmetro de com a String s passando o tipo -> { e imprima s}
        palavras.forEach((String s) -> {
            System.out.println(s);
        });

        //TODO: Forma 2
        // o parâmetro s são as Strings e imprimi s
        palavras.forEach(s -> System.out.println(s));
    }
}
