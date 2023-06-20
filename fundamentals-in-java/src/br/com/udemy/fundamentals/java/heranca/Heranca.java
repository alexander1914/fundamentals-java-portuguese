package br.com.udemy.fundamentals.java.heranca;

//TODO: Herança: é quando uma classe herda de outra classe, ela ganha TODOS os atributos
// e métodos da classe herdada.
public class Heranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alexander Vargas", 1990,
                "alexander.oliveira99@gmail.com");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Ano de nascimento: " + p1.getAno_nascimento());
        System.out.println("E-mail: " + p1.getEmail());

        System.out.println();

        Aluno aluno = new Aluno("Nathalia Vargas", 1997,
                "obr.nathi27@gmail.com", "MA1232456");

        System.out.println("Nome do Aluno(a): " + aluno.getNome());
        System.out.println("Ano de nascimento: " + aluno.getAno_nascimento());
        System.out.println("E-mail: " + aluno.getEmail());
        System.out.println("RA: " + aluno.getRa());

        System.out.println();

        Professor professor = new Professor("Maria José", 1977,
                "mariajose@prefeiturasp.gov.com.br", "RA898989");

        System.out.println("Nome do professor(a): " + professor.getNome());
        System.out.println("Ano de nascimento do professor: " + professor.getAno_nascimento());
        System.out.println("E-mail: " + professor.getEmail());
        System.out.println("Matricula: " + professor.getMatricula());
    }
}
