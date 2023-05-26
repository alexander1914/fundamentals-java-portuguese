package br.com.udemy.fundamentals.java.tipodedados;
public class Numericos {
    public static void main(String[] args) {
        //TODO: Inteiros e Reais

        //TODO: Tipos Primários:
        // são tipos comuns do Java
        long num0 = 999;
        int num1 = 4;
        short num2 = 4; // Inteiro (curto, menor, baixo)
        byte num3 = 1;
        char num00= 'A';

        //TODO: Tipos não primários(primitivos):
        // são classes que represetam esses tipo não primários

        Integer num4 = 99;// 32 BITS EM MEMÓRIA
        Short num5 = 7;// 16 BITS EM MEMÓRIA
        Byte num6 = 9;// 8 BITS EM MEMÓRIA
        Long num7 = (long)99999;// CAST, 64 BITS EM MEMÓRIA
        Character num8 = 'B';

        System.out.println("char        -> Num00 = " + num00);
        System.out.println("long        -> Num0  = " + num0);
        System.out.println("int         -> Num1  = " + num1);
        System.out.println("shor        -> Num2  = " + num2);
        System.out.println("byte        -> Num3  = " + num3);
        System.out.println("Integer     -> Num4  = " + num4);
        System.out.println("Shor        -> Num5  = " + num5);
        System.out.println("Byte        -> Num6  = " + num6);
        System.out.println("Long        -> Num7  = " + num7);
        System.out.println("Character   -> Num8  = " + num8);

        System.out.println("char/Character "   + Character.SIZE  + " bits");
        System.out.println("long/Long "        + Long.SIZE       + " bits");
        System.out.println("int/Integer "      + Integer.SIZE    + " bits");
        System.out.println("short/Short "      + Short.SIZE      + " bits");
        System.out.println("byte/Byte "        + Byte.SIZE       + " bits");

        System.out.println("Valor min int/Integer " + Integer.MIN_VALUE);
        System.out.println("Valor max int/Integer " + Integer.MAX_VALUE);

        System.out.println("Valor min short/Short " + Short.MIN_VALUE);
        System.out.println("Valor max short/Short " + Short.MAX_VALUE);

        System.out.println("Valor min byte/Byte " + Byte.MIN_VALUE);
        System.out.println("Valor max byte/Byte " + Byte.MAX_VALUE);

        System.out.println("Valor min long/Long " + Long.MIN_VALUE);
        System.out.println("Valor max long/Long " + Long.MAX_VALUE);

        System.out.println("Valor min char/Character " + Character.MIN_VALUE);
        System.out.println("Valor max char/Character " + Character.MAX_VALUE);
    }
}
