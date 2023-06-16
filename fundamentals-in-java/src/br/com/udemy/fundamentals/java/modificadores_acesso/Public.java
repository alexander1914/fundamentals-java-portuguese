package br.com.udemy.fundamentals.java.modificadores_acesso;

import br.com.udemy.fundamentals.java.encapsulamento.Cliente;

//TODO: Public: pode ser utilizado em todo projeto.
public class Public {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "Antonio Batista Oliveira",
                "Rua Verissimo Cardoso, 142 - Jardim Maristela"
        );

        //System.out.println("Nome: " + cliente.nome); private
        //System.out.println("Endereço: " + cliente.endereco); private
    }
}
