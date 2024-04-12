package br.com.udemy.fundamentals.java.strings;

//TODO: Strings: são imutáveis, ou seja não mudam,
// e também é um array de caracter.
// OBS: é questão de provas técnicas
public class Strings {
    public static void main(String[] args) {
        String string = "Alexander é um excelente pessoal";
        System.out.println(string);
        System.out.println("===============================");
        //TODO: Alterando com método replace()
         String novaString = string.replace("pessoal", "pessoa");
        System.out.println(novaString);
    }
}
