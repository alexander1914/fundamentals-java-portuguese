package br.com.udemy.fundamentals.java.estruturascontrole;

public class EstruturasDeControle {
    public static void main(String[] args) {
        //TODO: IF, ELSE e IFELSE são estruturas de decisões do java

        int numero = 5;
        if(numero > 5){
            System.out.println("Sim, o número " + numero + " é maior que 5");
        } else if (numero == 5) {
            System.out.println("Não, o número " + numero + " é igual 5");
        } else{
            System.out.println("Não, o número " + numero + " não é maior que 5");
        }

    }
}
