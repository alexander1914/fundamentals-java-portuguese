package br.com.udemy.fundamentals.java.listas;
//TODO: LinkedList: enquanto em uma lista ligada, eles estão em lugares diferentes, porém um aposta para o outro
// indicando o próximo elemento.
// [0][3][1][2][5][4][null]

import java.util.LinkedList;
import java.util.List;
public class LinkedListNow {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();
        lista.add("Carla");
        lista.add("Daniela");
        lista.add(2, "Larice");
        System.out.println(lista);
        System.out.println(lista.size());
    }
}
