package br.com.udemy.fundamentals.java.recursos_avancado;

import java.util.Comparator;
//TODO: Comparator: é utilizado para criar a sua própria comparator de objetos (String), para que seja possível
// desta forma ordenar a string pelo seu tamanho ao invés de ordem alfabética.
// A String1 é menor que a String2 = retornamos  -1
// A String1 é maior que a String2 = retornamos 1
// A String1 tem o mesmo tamanho da String2 = retornamos 0

public class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()){
            return -1;
        }else if (s1.length() > s2.length()) {
            return 1;
        }else {
            return 0;
        }
    }
}
