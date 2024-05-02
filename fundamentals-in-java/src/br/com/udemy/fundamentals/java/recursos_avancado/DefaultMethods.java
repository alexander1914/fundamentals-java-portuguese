package br.com.udemy.fundamentals.java.recursos_avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//TODO: Default Methods: são metódos concretos implementados em interfaces.
// Esses métodos, como são concretos ou seja já possuem uma implementação e não precisam ser implementados
// nas classes que implementam esta interface.

//TODO: Uma novidade implementada a partir da versão 8 do JAVA
// Atualmente estamos na versão 22
public class DefaultMethods {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        Comparator<String> comparator = new ComparadorPorTamanho();
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.add("José");
        palavras.add("Abraão");
        palavras.add("Jeremias");
        palavras.add("Debora");
        palavras.add("Maria");
        palavras.add("Marta");
        palavras.add("Jesus Cristo");
        /*
            Collections.sort(palavras, comparator;
         */

        //TODO: Foi implementando a partir do Java 8
        // Default methods in Java
        palavras.sort(comparator);
        palavras.forEach(consumidor);

    }
}
