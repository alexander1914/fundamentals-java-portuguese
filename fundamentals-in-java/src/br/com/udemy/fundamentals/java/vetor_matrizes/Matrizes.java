package br.com.udemy.fundamentals.java.vetor_matrizes;
public class Matrizes {
    public static void main(String[] args) {
        //TODO: Matrizes são multi-dimenssionais

        //TODO: Apenas declarando a matriz
        int numeros[][];

        //TODO: Declaração e definição de matrizes
        int numeros2[][] = new int [3][3];

        //TODO: Declarando, definindo o tamanho da matriz e inicializando
        int numeros3[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //TODO: Declarando uma matriz informando somente as linhas
        int numeros4[][] = new int[2][];
        numeros4[0] = new int[5];
        numeros4[1] = new int[3];

        //TODO: Parte 2
        int numeros5[][] = new int[3][3];
        numeros5[0][0] = 1;
        numeros5[0][1] = 2;
        numeros5[0][2] = 3;

        numeros5[1][0] = 4;
        numeros5[1][1] = 5;
        numeros5[1][2] = 6;

        numeros5[2][0] = 7;
        numeros5[2][1] = 8;
        numeros5[2][2] = 9;

        System.out.println("Acessando um número da matriz: " + numeros5[2][0]);

        for (int i = 0; i < numeros5.length; i++){
            for (int j = 0; j < numeros5[i].length; j++){
                System.out.println("Números[" + i +"][" + j + "] = " + numeros5[i][j]);
            }
        }
    }
}
