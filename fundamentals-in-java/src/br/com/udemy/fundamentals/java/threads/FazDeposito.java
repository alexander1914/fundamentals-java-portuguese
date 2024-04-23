package br.com.udemy.fundamentals.java.threads;

import br.com.udemy.fundamentals.java.encapsulamento.Conta;

public class FazDeposito implements Runnable{
    private Conta conta;

    public FazDeposito(Conta conta){
        this.conta = conta;
    }
    @Override
    public void run() {
        this.conta.depositar(100);
    }
}
