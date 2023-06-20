package br.com.udemy.fundamentals.java.heranca;

public class Professor extends Pessoa{
    private String matricula;
    public Professor(String nome, int ano_nascimento, String email,String matricula) {
        super(nome, ano_nascimento, email);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(){
        this.matricula = matricula;
    }

    public String toString(){
        return super.toString() + "\nMatricula: " + this.matricula;
    }
}
