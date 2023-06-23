package br.com.udemy.fundamentals.java.interfaces;
//TODO: Interfaces: são conhecidas como "contratos".
// Quem implementar este contrato é OBRIGADO a seguir as regras.

//TODO: Exemplo: Uma empresa criou um contrato 'com regras' para definir,
// a criação de um produto/serviço.
// João, decidiu criar um produto/serviço baseado neste contrato.
// Maria, também decidiu criar um produto/serviço baseado no mesmo contrato.

public class Interfaces {
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();

        System.out.println("A Marca do ventilador é: " + ventilador.MARCA);

        ventilador.desligar();
        ventilador.ligar();
        ventilador.desligar();
    }
}
