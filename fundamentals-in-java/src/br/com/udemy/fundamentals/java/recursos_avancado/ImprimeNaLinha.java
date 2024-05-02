package br.com.udemy.fundamentals.java.recursos_avancado;

import java.util.function.Consumer;

public class ImprimeNaLinha implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
