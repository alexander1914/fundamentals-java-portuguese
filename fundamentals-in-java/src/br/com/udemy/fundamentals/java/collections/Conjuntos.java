package br.com.udemy.fundamentals.java.collections;

import java.util.HashSet;
import java.util.Set;

//TODO: Conjunto: são implementados com a interface Set, e uma das classes que implementam está interface é a HashSet.
// OBS: A maioria das coleções possuem os mesmos métodos já conhecidos e utilizados com as listas.
// Mais o comportamento desses objetos é um pouco diferenre
// EX: A performance também é mellhor em conjuntos do que em listas.

//TODO: Característica dos conjuntos:
// Não aceitam valores repetidos.
// A ordem de inserção não é respeitada(Realiza uma semi-ordenação).
// Não aceitam ordenação.
// Não possui índice.
public class Conjuntos {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();
        nomes.add("Wellington");
        nomes.add("Phelipe");
        nomes.add("Danielle");

        //TODO: Conjuntos não aceitam repetição de valores
        nomes.add("Danielle");
        nomes.add("Phelipe");

        System.out.println(nomes.size());

        for (String nome : nomes){
            System.out.println(STR."Testando o SET: \{nome}");
        }
    }
}
