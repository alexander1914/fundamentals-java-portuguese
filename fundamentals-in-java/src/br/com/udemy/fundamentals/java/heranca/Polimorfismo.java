package br.com.udemy.fundamentals.java.heranca;

//TODO: Polimorfismo: são objetos do mesmo tipo, podem agir de formas diferentes.
// Poli - Muitas
// Morfismo - Forma
public class Polimorfismo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Felipe Nunes", 2002,
                "felipenunes00@gmail.com");
        System.out.println(pessoa);

        System.out.println();

        Aluno aluno = new Aluno("João Pedro", 2005,
                "joaopedro01@gmail.com","RA741236");
        System.out.println(aluno);

        System.out.println();

        Professor professor = new Professor("Paulo Andrade", 1977,
                "pauloandrade.gov.com.br", "MA123645");
        System.out.println(professor);

    }
}
