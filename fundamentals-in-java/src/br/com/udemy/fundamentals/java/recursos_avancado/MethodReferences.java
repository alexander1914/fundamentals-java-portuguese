package br.com.udemy.fundamentals.java.recursos_avancado;
//TODO: Method References: Podem ser considerados simplificações das expressões lambdas.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> titulos = new ArrayList<String>();
        titulos.add("Mundial de Clubes FIFA");
        titulos.add("Super Copa do Brasil");
        titulos.add("Recopa");
        titulos.add("Super Mundial de clubes FIFA");


        //TODO: Form: 1 com a expressão lambda
        /*
            titulos.sort(Comparator.comparing(s -> s.length()));
        */

        //TODO: Implementando o method references
        // Form 1
        titulos.sort(Comparator.comparing(String::length));

        //TODO: Method References
        // Form 2
        Function<String, Integer> tamanho = String::length;
        Comparator<String> comparador = Comparator.comparing(tamanho);
        titulos.sort(comparador);

        //TODO: Method References
        titulos.forEach(System.out::println);
        System.out.println(titulos);
    }
}
