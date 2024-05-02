package br.com.udemy.fundamentals.java.recursos_avancado;
//TODO: Classes Anônimas: são classes sem nome.
// Utilizamos classes anônimas quando temos interfaces com um ou pouco métodos
// e não precisamos reaproveitar o código da classe.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//TODO: Ou seja, se não iremos precisar reaproveitar a classe em um outro lugar do nosso sistema e esta classe
// que eu deveria criar iria apenas implementar uma interface com um ou poucos métodos,
// podemos utilizar o conceito de classe anônima.
public class ClassesAnonimasOutraForma {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("Alexander");
        palavras.add("Oliveira");
        palavras.add("Vargas");

        Comparator<String> comparador = new ComparadorPorTamanho();
        palavras.sort(comparador);

        //TODO: Implementando a classe anônima de uma forma diferente.....
        // OBS: new não de uma instância de um objeto mas sim de um classe anônima
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
