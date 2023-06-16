package br.com.udemy.fundamentals.java.modificadores_acesso;

import br.com.udemy.fundamentals.java.encapsulamento.Cliente;

//TODO:  Private: Privado á própria classe, ou seja só temos acesso ao atributo ou método privado
// dentro da própria classe onde ele foi declarado.
public class Private {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gloria Pires", "Av.Paulista, 1001");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());

        Cliente cliente2 = new Cliente("Arrrow", "Central city, 4545");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Endereço: " + cliente2.getEndereco());
    }
}
