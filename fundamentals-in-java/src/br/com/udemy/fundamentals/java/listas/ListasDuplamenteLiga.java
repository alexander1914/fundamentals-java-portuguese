package br.com.udemy.fundamentals.java.listas;
//TODO: Lista Duplamente Ligada:
public class ListasDuplamenteLiga {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adiciona("Alexander");
        System.out.println(lista);
        lista.adiciona("Danielle");
        System.out.println(lista);

        lista.contem("Alexander");
        lista.remove(1);

        System.out.println(lista.contem(0));
        System.out.println(lista);

        /*
            lista.remove(0);
            System.out.println(lista);
         */
    }
}
