package br.com.udemy.fundamentals.java.orientacao_objeto;
public class Pessoa {
    //TODO: Classes representam um objeto contendo atributos e metódos
    //TODO: Atributos são características da classe(modelo de dados)
    String nome, email;
    int ano_nascimento;

    //TODO: Construtor vazio
    public Pessoa(){

    }
    //TODO: Construtor com paramêtro
    public Pessoa(String nome, String email, int ano_nascimento){
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;
    }

    void imprirInformacoes(){
        System.out.println("========== Pessoas ===========");
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Ano de Nascimento: " + this.ano_nascimento);
        System.out.println("");
    }
}
