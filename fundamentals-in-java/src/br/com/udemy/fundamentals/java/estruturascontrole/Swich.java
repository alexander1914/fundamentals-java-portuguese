package br.com.udemy.fundamentals.java.estruturascontrole;
public class Swich {
    public static void main(String[] args) {
        //TODO: Instrução Switch
        int numero  = 11;

        switch (numero){
            case 1:
                System.out.println("Esse número é de Goleiro");
                break;
            case 2:
                System.out.println("Esse número é de Lateral");
                break;
            case 5:
                System.out.println("Esse número é de 1 Volante");
                break;
            case 8:
                System.out.println("Esse número é de 2 Volante");
                break;
            case 11:
                System.out.println("Esse número é de Atacante");
                break;
            default:
                System.out.println("[Default] O número é " + numero);
        }
    }
}
