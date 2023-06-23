package br.com.udemy.fundamentals.java.atributos_metodos_estaticos;
//TODO: Atributos Estáticos: são atributos, onde os valores são compartilhados
// entre as instâncias da classe.
public class AtributosEstaticos {
    public static void main(String[] args) {
        Conta conta = new Conta("Alexander Oliveira");
        System.out.println(conta.getNumero());
        System.out.println(conta.getCliente());

        System.out.println();

        Conta conta2 =new Conta("Felicity Jones");
        System.out.println(conta2.getNumero());
        System.out.println(conta2.getCliente());

        System.out.println();

        Conta conta3 = new Conta("Maria das Graças");
        System.out.println(conta3.getNumero());
        System.out.println(conta3.getCliente());

        System.out.println();

        //TODO: Para utilizar um atributo estático, colocamos o nome da classe
        // junto ao atributo.

        System.out.println(Conta.contador);
    }
}
