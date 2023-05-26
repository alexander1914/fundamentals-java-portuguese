package br.com.udemy.fundamentals.java.tipodedados;
public class Alfanumericos {
    public static void main(String[] args) {
        //TODO: Tipos Primitivos

        char letra1 = 'a';
        char letra2 = 97;// o número 97 em decimal == a
        letra2 = (char) (letra1 + 1);// Ex: Cast

        //string nomes = "dahjsa"; Não existe esse tipo primitivo string em Java

        System.out.println("Letra1 " + letra1);
        System.out.println("Letra2 " + letra2);

        //TODO: Tipos Não Primitivos
        Character letra3 = 'A';
        String nome = "Alexander Francisco Maciel";

        System.out.println("Letra3 " + letra3);
        System.out.println("Nome " + nome);

        System.out.println("char/Character " + Character.SIZE + " bits");
        System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
        System.out.println("Meu nome o tamanho da string é: " + nome.length());

        System.out.println("Valor min char/Character " + Character.MIN_VALUE);
        System.out.println("Valor max char/Character " + Character.MAX_VALUE);
    }
}
