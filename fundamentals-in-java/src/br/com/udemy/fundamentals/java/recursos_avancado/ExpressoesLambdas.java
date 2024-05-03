package br.com.udemy.fundamentals.java.recursos_avancado;

import java.util.ArrayList;
import java.util.List;

//TODO: Expressões Lambdas: são funções anônimas -> ou seja funções em nome.
// OBS: Já sabemos que podemos utilizar expressões lambdas com interfaces funcionais.
// Devemos então criar uma função lambda compatível com a função da interface
// que estivermos utilizando.
public class ExpressoesLambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Alexander");
        palavras.add("Oliveira");
        palavras.add("Vargas");
        palavras.add("Téo");

        //TODO: Implementando o uma expressão lambda para subistituir a Classe ComparadorPorTamanho com a lambda
        // Passando os parâmetros s1, s2 e em seguinda faço a validação para retorna um inteiro.
        // Forma 1:
        /*
        palavras.sort((s1, s2) -> {
            if (s1.length() < s2.length()){
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            }else {
                return 0;
            }
        });
        */

        //TODO: Forma 2
        // Integer acessando um método desse objeto compare(s1, s2) passando como parâmetros
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.forEach(s -> System.out.println(s));
    }
}
