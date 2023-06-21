package br.com.udemy.fundamentals.java.heranca;

//TODO: Benefícios da Herança:
// Evita a repetição de código
// Facilita a manuntenção do programa

//TODO: Classe específica, Sub-classe e classe filha.
// (extends) para fazer uma herança
public class Aluno extends Pessoa{
    private String ra;

    public Aluno(String nome, int ano_nascimento, String email,String ra){
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    //TODO: Overriding / Sobrescrita de método
    public String toString(){
        return super.toString() + "\nR.A: " + this.ra;
    }
}
