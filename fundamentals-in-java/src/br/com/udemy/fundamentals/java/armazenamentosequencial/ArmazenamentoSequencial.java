package br.com.udemy.fundamentals.java.armazenamentosequencial;

import static java.lang.StringTemplate.STR;

//TODO: Armazenamento sequencial:
public class ArmazenamentoSequencial {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Alexander");
        Aluno a2 = new Aluno("Eduarda");
        Aluno a3 = new Aluno("Bruna");

        var lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);

        System.out.println(STR."Total de alunos: \{lista.tamanho()}");

        System.out.println(lista);

        System.out.println(lista.contem(a1));

        try {
            System.out.println(lista.pega(10));
        }catch (IllegalArgumentException e){
            System.out.println(STR."O Aluno da posição 101 não existe \{e}");
            System.out.println(e.getMessage());
        }

        try {
            Aluno a4 = new Aluno("Dudu");
            lista.adiciona(1, a4);
            System.out.println(lista);
        }catch (IllegalArgumentException e){
            System.out.println("A posição 101 é inválida");
        }
        lista.remove(0);
        System.out.println(lista);
    }
}
