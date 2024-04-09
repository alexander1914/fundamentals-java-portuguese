package br.com.udemy.fundamentals.java.encapsulamento;

public class Cliente extends Conta {
    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;

        this.dizerOi();
    }
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }

    private void dizerOi(){
        System.out.println(this.nome + " está dizendo oi...");
    }
}
