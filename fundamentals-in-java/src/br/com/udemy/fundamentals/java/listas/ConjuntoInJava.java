package br.com.udemy.fundamentals.java.listas;
import java.util.HashSet;
import java.util.Set;

//TODO: Conjunto com a implementação do Java é a SET
// Set é um conjunto no Java
// hasCode() retorna o indice da String.
public class ConjuntoInJava {
    public static void main(String[] args) {
        Set<String> tecnicosDoPalmeiras = new HashSet<String>();
        tecnicosDoPalmeiras.add("Muricy Ramalho");
        tecnicosDoPalmeiras.add("Leão");
        tecnicosDoPalmeiras.add("Luxemburgo");
        tecnicosDoPalmeiras.add("Marcelo Ferreira");
        tecnicosDoPalmeiras.add("Osvaldo Brandão");
        tecnicosDoPalmeiras.add("Abel Ferreira");

        System.out.println("Abel Ferreira".hashCode());

        System.out.println(tecnicosDoPalmeiras);
    }
}
