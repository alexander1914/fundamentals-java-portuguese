package br.com.udemy.fundamentals.java.armazenamentosequencial;

import java.util.Objects;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public boolean equals(Object object) {
        Aluno outro = (Aluno) object;
        return outro.getNome().equals(this.nome);
    }
    @Override
    public String toString() {
        return this.nome;
    }
}
