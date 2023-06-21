package br.com.udemy.fundamentals.java.classes_abstratas;

public class TestandoAbstract extends ClasseAbstrata{

    public static void main(String[] args) {
        ClasseAbstrata classeAbstrata = new TestandoAbstract();
        classeAbstrata.imprimirAbstract("Executando uma classe abstract...");
    }
    @Override
    public void imprimirAbstract(String texto) {
        System.out.println(texto);
    }
}
