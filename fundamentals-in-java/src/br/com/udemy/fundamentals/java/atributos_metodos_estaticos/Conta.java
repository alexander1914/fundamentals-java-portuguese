package br.com.udemy.fundamentals.java.atributos_metodos_estaticos;

public class Conta {
    private int numero;
    private String cliente;

    //TODO: Atributo statico: onde está sendo compartilhado entre as instâncias da classe.
    public static int contador = 1;

    public Conta(String cliente){
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador = Conta.contador + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public static int proximaConta(){
        return Conta.contador;
    }
}
