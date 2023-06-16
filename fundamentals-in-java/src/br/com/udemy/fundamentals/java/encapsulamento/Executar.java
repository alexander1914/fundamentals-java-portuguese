package br.com.udemy.fundamentals.java.encapsulamento;

public class Executar {
    public static void main(String[] args) {
        Cliente alexander = new Cliente(
                "Alexander Albquerque Oliveira",
                "Rua Morro do Valongo, 114 Jardim Pery"
        );

        Cliente nathalia = new Cliente(
                "Nathalia Vargas de Albquerque Silva",
                "Rua Morro do Valongo, 114 Jardim Pery"
        );

        Conta conta1 = new Conta(
                1,
                100,
                200,
                nathalia
        );

        Conta conta2 = new Conta(
                2,
                100,
                200,
                alexander
        );

        System.out.println("Saldo do Alexander(Antes do Saque): " + conta1.getSaldo());
        System.out.println("Saldo do Nathalia (Antes do Saque): " + conta2.getSaldo());

        conta1.sacar(300);
        conta2.sacar(300);

        System.out.println("Saldo do Alexander(Depois do Saque): " + conta1.getSaldo());
        System.out.println("Saldo do Nathalia (Depois do Saque): " + conta2.getSaldo());
    }
}
