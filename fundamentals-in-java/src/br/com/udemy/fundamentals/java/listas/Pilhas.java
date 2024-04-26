package br.com.udemy.fundamentals.java.listas;
//TODO: Pilhas: São estruturas de dados onde o elemento que está visível/disponível é o que está sempre no topo.
// Os elementos, ao serem adicionados em um pilha, são adicionados sempre no topo.
// Para remover elementos da pilha, só podemos remover do topo.
// [2] -> este tenhos acesso.
// [1]
// [0]
public class Pilhas {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        System.out.println(pilha);

        pilha.insere("Abel Ferreira");
        pilha.insere("Dudu");
        String topo = pilha.pegaTopo();
        System.out.println(topo);
        pilha.remove();
        System.out.println(pilha.vazia());
        System.out.println(pilha);
    }
}
