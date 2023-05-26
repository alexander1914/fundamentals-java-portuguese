package br.com.udemy.fundamentals.java.tipodedados;
public class Reais {
    public static void main(String[] args) {
        //TODO: Tipos primitivos(primários)
        //Por padrão, os números reais em java são considerados double
        float preco1 = 23.9f;// é mais comum para valores menores
        double preco2 = 49.90;

        //TODO: Não Primários/Primitivos
        Float preco3 = 99.90f;
        Double preco4 = 99.90;

        System.out.println("float   -> preco1 = " + preco1);
        System.out.println("double  -> preco2 = " + preco2);
        System.out.println("Float   -> preco3 = " + preco3);
        System.out.println("Double  -> preco4 = " + preco4);
    }
}
