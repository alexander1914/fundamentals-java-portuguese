package br.com.udemy.fundamentals.java.recursos_avancado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TODO:
// - Classes anônimas
//   - Lambdas
//      - Method References

public class Revisao {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        //TODO: Implementando o uso das funções anonimas
        cursos.add(new Curso("Angular Fundamentos", 200));
        cursos.add(new Curso("Java Fundamentos", 400));
        cursos.add(new Curso("TypeScript Fundamentos", 100));
        cursos.add(new Curso("DevOps", 0));
        cursos.add(new Curso("AWS Services", 150));

        //TODO: Implementando a lambda function
        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        //TODO: Implementando Method References
        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.forEach(c -> System.out.println(c.getNome()));
    }
}
