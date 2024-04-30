package br.com.udemy.fundamentals.java.listas;
//TODO: Filas: Todo elemento entra na final da fila
// O primeiro elemento a entrar é também o primeiro a sair.
//TODO: <- [0][1][2][3]
public class Filas {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila);

        fila.adiciona("Phelipe ");
        fila.adiciona("Alexander");
        fila.adiciona("Danielle");
        fila.adiciona("Welligton");
        System.out.println(fila);

        String ret = fila.remove();
        System.out.println(ret);
        System.out.println(fila);

        fila.remove();
        fila.remove();
        fila.remove();

        boolean bool = fila.vazia();
        System.out.println(bool);

        fila.remove();
        System.out.println(fila);
    }
}
