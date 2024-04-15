package br.com.udemy.fundamentals.java.collections;

import java.util.*;

//TODO: Mapas/Map: os mapas são representados em Java pela interface Map
// e mapeia seus elementos utilizando o conceito de chave/valor.
public class Mapas {
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<Integer, String>();

        pessoas.put(33, "Alexander Albuquerque Oliveira");
        pessoas.put(26, "Nathalia Vargas");
        pessoas.put(23, "Phelipe Oliveira");

        //TODO: Disponibilizado a partir do Java 8
        pessoas.keySet()
                .forEach(idade -> {
                    System.out.println(pessoas.get(idade));
                });
        System.out.println("*************************************************************************");
        //TODO: Interações na coleção de chaves
        System.out.println("Testando as interações com chave: ");
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade : chaves){
            System.out.println(idade);
        }
        System.out.println("*************************************************************************");
        //TODO: Interações na coleção de valores
        System.out.println("Testando as interações com valores: ");
        Collection<String> valores = pessoas.values();
        for (String nome : valores){
            System.out.println(nome);
        }
        // Form 2
        pessoas.values().forEach(nome -> {
            System.out.println(nome);
        });
        System.out.println("*************************************************************************");
        //TODO: Iterar a coleção de associações
        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
        for (Map.Entry<Integer, String> associacao : associacoes){
            System.out.println(STR."\{associacao.getKey()} - \{associacao.getValue()}");
        }
        // Form 2
        pessoas.entrySet().forEach(associocao -> {
            System.out.println(STR."\{associocao.getKey()} = \{associocao.getValue()}");
        });
        System.out.println("**************************************************************");
        //TODO: Coleção de chave
        System.out.println(STR."KEYS: " + pessoas.values());
        //TODO: Coleção de valores
        System.out.println(STR."VALUES: " + pessoas.keySet());
        //TODO: Coleção de Associações
        System.out.println(STR."ASSOCIAÇÂO: " + pessoas.entrySet());
    }
}
