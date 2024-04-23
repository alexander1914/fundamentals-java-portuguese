package br.com.udemy.fundamentals.java.threads;

import br.com.udemy.fundamentals.java.encapsulamento.Cliente;
import br.com.udemy.fundamentals.java.encapsulamento.Conta;

//TODO: Thread Não Sincronizada: ela é não instavél

//TODO: Por padrão as threads não são sincronizadas.
// OBS: Pode ocorrer problemas de um thread acessar o valor de um objeto que ainda não foi atualizado,
// ou ainda as threads executaram depois do valor já estar impresso.
public class ThreadNaoSincronizado {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("José Dantas", "Rua Liberdade 1001 - Braga");
        Conta conta1 = new Conta(1,200,300, cliente1);

        FazDeposito acao = new FazDeposito(conta1);
        //TODO: Implementando as Threads
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start();
        t2.start();

        System.out.println(conta1);
    }

}
