package br.com.udemy.fundamentals.java.tipodedados;
public class Booleanos {
    public static void main(String[] args) {
        //TODO: Tipos Primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        //TODO: Tipo Não Primitivos
        Boolean v = true;
        Boolean f = false;

        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("V: " + v);
        System.out.println("F: " + f);

        if(verdadeiro == true){
            System.out.println("É verdadeiro");
        }else{
            System.out.println("É Falso");
        }
    }
}
