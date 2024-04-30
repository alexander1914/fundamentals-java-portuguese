package br.com.udemy.fundamentals.java.listas;
//TODO: Conjuntos: uma das caractéristicas dos conjuntos é a não aceitação
// de elementos repetidos

//TODO: Gera performance
// A = [Alexander, Amanda, Andréia]
// B = [Balico, Bob, Basilio]
// C = [Cristian, Carla, Cecilia]
import java.util.LinkedList;

public class Conjuntos {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        System.out.println(conjunto);

        conjunto.adiciona("Alexander");
        conjunto.adiciona("Abel");
        conjunto.adiciona("Jhonny");
        conjunto.adiciona("Giovanni");
        conjunto.adiciona("Eduarda");
        conjunto.adiciona("Karina");
        conjunto.adiciona("Welligton");

        conjunto.remove("Karina");
        conjunto.remove("Julia");
        System.out.println(conjunto);
    }
}
