package br.com.udemy.fundamentals.java.vetor_matrizes;
public class Vetores {
    public static void main(String[] args) {
        //TODO: Array são vetores uni-demensionais

        //TODO: Declarando e especificando o tamanho do vetor,
        // depois de definir o array não pode ser alterado e não aceitam outros tipos

        int outrosNumeros[] = {99, 20, 21, 23, 24};
        float valores[] = new float[5];
        char caracteres[] = new char[10];
        String nomes[] = new String[15];
        int numeros[] = new int [10];

        //TODO: Parte 2
        System.out.println("Tamanho do vetor: " + numeros.length);

        //TODO: Fazendo a interação do vetor de numeros
        for(int i = 0; i < numeros.length; i++){
            //numeros[i] = i +3;
            numeros[i] = (int)Math.round(Math.random() * 10);
        }

        System.out.println(numeros[0]);// Primeiro elemento
        System.out.println(numeros[9]);// Último elemento

    }
}
