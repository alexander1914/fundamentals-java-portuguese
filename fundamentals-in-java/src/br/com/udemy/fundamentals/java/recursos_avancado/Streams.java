package br.com.udemy.fundamentals.java.recursos_avancado;

//TODO: Streams: são fluxos de dados ou fluxo de objetos utilizadas para que possamos,
// trabalhar com essas dados e de forma mais criteriosas
// EX: Aplicar um Filtro

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Angular Fundamentos", 200));
        cursos.add(new Curso("Java Fundamentos", 400));
        cursos.add(new Curso("TypeScript Fundamentos", 100));
        cursos.add(new Curso("DevOps", 500));
        cursos.add(new Curso("AWS Services", 150));

        //TODO: Quando trabalhamos com um stream, os métodos aplicados a este stream
        // não afeta a coleção original
        System.out.println("**************************************************");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 200)
                .forEach(c -> System.out.println(c.getNome()));
        System.out.println("********************* MAP ************************");

        List<Curso> curso2 = cursos;
        curso2.stream()
                .filter(c -> c.getAlunos() <= 150)
                //TODO: Implementando o metodo map() para fazer o mapeamento
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        System.out.println("******************* mapToInt **********************");

        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                //TODO: mapToInt -> o retorno dele permite utilizar o metodo sum()
                .mapToInt(Curso::getAlunos)
                .sum();

        System.out.println(STR."A soma de todos os cursos com mais de 100 alunos é: \{soma}");

        System.out.println("******************** findAny **********************");
        List<Curso> curso3 = cursos;
        curso3.stream()
                .filter(c -> c.getAlunos() >= 150)
                //TODO: findAny -> para pegar qualquer curso
                .findAny()
                //.findFirst()
                .ifPresent(System.out::println);
        System.out.println("***************************************************");

        //TODO: Armezenando o resultada de uma stream em uma nova lista
        List<Curso> resultado = cursos.stream()
                .filter(c -> c.getAlunos() == 500)
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);

        System.out.println("********************** toMap *************************");
        //TODO: parallelStream(): é para executar a threads em pararelelo com muitos dados
        cursos.parallelStream()
                .filter(c -> c.getAlunos() > 0)
                .collect(Collectors.
                        toMap(c -> c.getNome(), c -> c.getAlunos()))
                .forEach((nome, estudantes) ->
                        System.out.println(STR."\{nome} tem \{estudantes} estudantes"));

    }
}
