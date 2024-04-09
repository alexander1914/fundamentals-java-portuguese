package br.com.udemy.fundamentals.java.javaLang;

import br.com.udemy.fundamentals.java.encapsulamento.Cliente;
import br.com.udemy.fundamentals.java.encapsulamento.Conta;

//TODO: Java Lang: é a classe mãe do Java assim que criar uma classe no seu projeto.
// OBS: A classe Object, faz parte do pacote java.lang.
// Lang: definição de linguagem.
public class JavaLang {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Alexander Albuquerque Oliveira", "Rua Remelhe 26, R/C - Dume");
        Cliente cli2 = new Cliente("Felicity Jones", "Rua 2 345, R/C - Dume");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 200,300, cli2);

        Caixa prateleira = new Caixa();

        System.out.println(c1);
        System.out.println(c2);

        if (c1.equals(cli1)){
            System.out.println("São a mesma conta...");
        }else {
            System.out.println(STR."São contas diferentes: \{c1.hashCode()} != \{c2.hashCode()}");
        }

        prateleira.adicionar(c1);
        prateleira.adicionar(c2);

        System.out.println(((Conta)prateleira.pegar(0)).getSaldo());
        prateleira.adicionar(cli1);

        System.out.println(((Cliente)prateleira.pegar(2)).getNome());

        //TODO: instanceof: é uma função para validar se é uma instância do Objeto.
        if(cli1 instanceof Conta){
            System.out.println("O objeto é do tipo Conta");
        }else {
            System.out.println("O objeto não é do tipo Conta");
        }
    }
}
