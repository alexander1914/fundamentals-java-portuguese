package br.com.udemy.fundamentals.java.listas;
//TODO: Vetor: Em um vetor, os elementos estão um do lado do outro.

//TODO: LinkedList: enquanto em uma lista ligada, eles estão em lugares diferentes, porém um aposta para o outro
// indicando o próximo elemento.
// [0][3][1][2][5][4][null]
public class LinkedLists {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista);

        lista.adiciona("Francisco");
        System.out.println(lista);

        lista.adicionaNoComeco("Maria");
        System.out.println(lista);

        lista.adiciona(1, "Nathalia");
        System.out.println(lista);

        Object elemento = lista.pega(1);
        System.out.println(elemento);

        System.out.println(lista.tamanho());

        lista.removeDoComeco();
        System.out.println(lista);
    }
}
