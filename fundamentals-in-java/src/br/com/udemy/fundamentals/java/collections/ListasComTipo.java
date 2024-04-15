package br.com.udemy.fundamentals.java.collections;
//TODO: Listas: podem ser vetores e matrizes

//TODO: Arrays: tem um tanhamo fixo ou seja, se criarmos um array com 5 elementos ele terá sempre no máximo 5 elementos.
// um Array tem um tipo de dado fixo ou seja se criarmos um array de String ele só poderá ter Strings de elementos.
// É difícil encontrar um determinado elemento em um array.
// Para isso precisamos varrer o array completo pelo os índices, caso não faça busca pelo índice.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODO: Collections: são coleções de itens
// Java possui diversas classes/interfaces que facilitam muito o trabalho quando, se trata de coleções de dados.
// Essa classes/interfaces são chamadas de Collections(Coleção).
public class ListasComTipo {
    public static void main(String[] args) {
        //TODO: Listas: possuem repitição de valores e possuem tamanho 'infinito' depende da memória.
        // OBS: podemos criar uma lista tipo Object(genérica) como também definindo um tipo para lista.

        List<String> titulos = new ArrayList<String>();

        titulos.add("Super Copa do Brasil");
        titulos.add("Recopa");
        titulos.add("Recopa");//Uma repetição exemplo.
        titulos.add("Mundial de Clubes FIFA");

        Collections.sort(titulos);

        //TODO: For in java
        for (int i = 0; i < titulos.size(); i++) {
            System.out.printf("Abel Ferreira: %s%n", titulos.get(i));
        }
    }
}
