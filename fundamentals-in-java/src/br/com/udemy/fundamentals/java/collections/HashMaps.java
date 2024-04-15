package br.com.udemy.fundamentals.java.collections;

import br.com.udemy.fundamentals.java.encapsulamento.Cliente;
import br.com.udemy.fundamentals.java.encapsulamento.Conta;

import java.util.HashMap;
import java.util.Map;

//TODO: HashMap: a classe HashMap implementa a interface Map e trabalha com chave e valor.
//TODO: Características :
// Não aceitam chaves repetidos mas valores sim.
public class HashMaps {
    public static void main(String[] args) {
        //TODO: HashMap:
        Map<String, Conta> contas = new HashMap<String, Conta>();

        Cliente cli1 = new Cliente("Alexander Oliveira", "Rua de remelhe 26 R/C - Braga");
        Cliente cli2 = new Cliente("Alter Solutions", "Rua 1 5 andar - Porto");

        Conta conta1 = new Conta(1, 0, 1000, cli1);
        Conta conta2 = new Conta(2,100000,3000000, cli2);

        contas.put("Pessoa Física", conta1);
        contas.put("Pessoa Jurídica", conta2);

        System.out.println(contas.size());
        System.out.println(contas.get("Pessoa Física"));

    }
}
