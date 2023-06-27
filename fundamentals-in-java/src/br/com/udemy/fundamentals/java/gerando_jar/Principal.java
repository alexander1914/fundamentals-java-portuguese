package br.com.udemy.fundamentals.java.gerando_jar;

import br.com.udemy.fundamentals.java.encapsulamento.Cliente;
import br.com.udemy.fundamentals.java.encapsulamento.Conta;

import java.util.Scanner;

//TODO: Gerando executáveis JAR
// JAR - Java Archive
// Java Archive - Arquivo Compactado Java
// zip/jar
public class Principal {

    static Cliente cliente = new Cliente("Felicity Stones", "Central city, 100");
    static Conta conta = new Conta(1,200,300, cliente);
    static Scanner teclado = new Scanner(System.in);

    public static  void depositar(){
        System.out.println("============ Depósito ===============");
        System.out.println("Infome o valor para depósito: ");
        float valor = teclado.nextFloat();

        if (valor > 0){
            conta.depositar(valor);
            System.out.println("Depósito efetuado com sucesso...");
        }else{
            System.out.println("O valor precisa ser positivo !!!");
        }
    }

    public static void sacar(){
        System.out.println("========== Sacar =================");
        System.out.println("Informe o valor para o saque: ");
        float valor = teclado.nextFloat();

        if (valor > 0){
            conta.sacar(valor);
        }else{
            System.out.println("O valor precisa ser positivo !!!");
        }
    }

    public static void consultar(){
        System.out.println("Seu saldo é " + conta.getSaldo());
    }
    public static void main(String[] args) {
        int opcao = 0;
        System.out.println("========== Bem vindo ao Java JAR ==============");
        do {
            System.out.println("Selecione uma opção abaixo: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    depositar();
                    break;

                case 2:
                    sacar();
                    break;

                case 3:
                    consultar();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.3");
                    break;
            }
        }while (opcao > 0);
    }
}
