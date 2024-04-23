package br.com.udemy.fundamentals.java.threads;

import br.com.udemy.fundamentals.java.encapsulamento.Cliente;
import br.com.udemy.fundamentals.java.encapsulamento.Conta;

//TODO: Thread Sincronizada: ela é instavél
public class ThreadsSincronizada {
    public static void main(String[] args) throws InterruptedException {
        Cliente cliente1 = new Cliente("José Dantas", "Rua Liberdade 1001 - Braga");
        Conta conta1 = new Conta(1,500,300, cliente1);

        FazDeposito acao = new FazDeposito(conta1);
        //TODO: Implementando as Threads
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start();
        System.out.println(STR."Feito o primeiro depósito: " + conta1.getSaldo());
        System.out.println("1 - Thread... Done");
        t2.start();
        System.out.println(STR."Feito o segundo depósito: " + conta1.getSaldo());
        System.out.println("2- Thread... Done");
        //TODO: Avisando que a thread T1 e T2 deve 'se juntar' a um sincronizador
        System.out.println("Sincronizando as Threads now...");
        t1.join();
        t2.join();

        System.out.println(STR."O valor da sua conta agora é: " + conta1);
    }
}
