package br.com.udemy.fundamentals.java.listas;

import java.util.Stack;
public class PilhasJava {
    public static void main(String[] args) {
        //TODO: Stack : é a implementação do Java para trabalhar com filas.
        // push == add()
        // pop == remove()
        // peek = metodo para retorna do topo.
        Stack<String> nomes = new Stack<String>();
        System.out.println(nomes);
        nomes.push("Nathalia Vargas");
        nomes.push("Jesus Cristo");

        String remove = nomes.pop();
        System.out.println(remove);

        //TODO: Retorna o elemento do topa este método.
        String topo = nomes.peek();
        System.out.println(topo);
        System.out.println(nomes);
    }

}
