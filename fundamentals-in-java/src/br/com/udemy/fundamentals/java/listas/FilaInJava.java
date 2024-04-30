package br.com.udemy.fundamentals.java.listas;

import java.util.LinkedList;
import java.util.Queue;

//TODO: Fila na implementação do Java: Queue
// poll -> remove()

public class FilaInJava {
    public static void main(String[] args) {
        Queue<String> titulos = new LinkedList<String>();
        titulos.add("Paulistão 2024");
        titulos.add("Brasileirão 2023");
        titulos.add("Paulistão 2023");
        titulos.add("Super Copa do Brasil 2023");
        titulos.add("Libertadores 2023");

        /*
            titulos.poll();
         */

        System.out.println(STR."Últimos títulos com ABEL FERREIRA no Palmeiras: \{titulos}");
    }
}
