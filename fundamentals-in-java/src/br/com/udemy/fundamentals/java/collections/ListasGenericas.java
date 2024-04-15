package br.com.udemy.fundamentals.java.collections;
//TODO: Listas: podem ser vetores e matrizes

//TODO: Arrays: tem um tanhamo fixo ou seja, se criarmos um array com 5 elementos ele terá sempre no máximo 5 elementos.
// um Array tem um tipo de dado fixo ou seja se criarmos um array de String ele só poderá ter Strings de elementos.
// É difícil encontrar um determinado elemento em um array.
// Para isso precisamos varrer o array completo pelo os índices, caso não faça busca pelo índice.

import java.util.ArrayList;
import java.util.List;

//TODO: Collections: são coleções de itens
// Java possui diversas classes/interfaces que facilitam muito o trabalho quando, se trata de coleções de dados.
// Essa classes/interfaces são chamadas de Collections(Coleção).
public class ListasGenericas {
    public static void main(String[] args) {

        System.out.println("***********************************************************************");
        System.out.println("Lista Génerica para qualquer tipo(Object):");
        List<Object> generica = new ArrayList<>();
        generica.add(12);
        generica.add("Pois");
        generica.add(2.000);

        //TODO: Foreach in java
        for (Object item : generica){
            System.out.println(STR."Itens: \{item}");
        }
    }
}
