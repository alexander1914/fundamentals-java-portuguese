package br.com.udemy.fundamentals.java.estruturasrepeticao;
public class Foreach {
    public static void main(String[] args) {

        String nome = "Alexander Francisco Maciel";
        for (char letra : nome.toCharArray()) {
            System.out.println(letra);
        }

    }
}
