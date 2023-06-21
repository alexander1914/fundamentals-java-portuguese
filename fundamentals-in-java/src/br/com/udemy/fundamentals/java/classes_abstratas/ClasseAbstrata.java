package br.com.udemy.fundamentals.java.classes_abstratas;
//TODO: Classes Abstratas: é um recurso que proporciona um bloqueio na criação de objetos
// Não conseguimos instanciar objetos de uma classe abstrata.

//TODO: Desta forma, impossibilitamos a criação de objetos desta classe.
// uma classe abstrata pode ter:
// - atributos
// - Métodos
// - Métodos abstratos: São métodos, que não possuem implementação, possuem apenas declaração,
// e obrigatóriamente as classes que herdarem desta classe com método abstrato,
// precisa implementar estes métodos.

public abstract class ClasseAbstrata {

    //TODO: Declaração de um método abstrato
    public abstract void imprimirAbstract(String texto);
}
