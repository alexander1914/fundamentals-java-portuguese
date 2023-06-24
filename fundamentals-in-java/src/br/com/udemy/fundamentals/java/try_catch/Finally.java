package br.com.udemy.fundamentals.java.try_catch;

public class Finally {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3 * 2;
        }

        for (int i = 0; i <= numeros.length; i++){
            //TODO: Try é Tente fazer isso
            try{
                System.out.println(numeros[i]);
                //TODO: catch: captura a exceção do erro
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Você está tentando acessar um posicão do array" +
                        "que não existe..");
                //TODO: finally: encerra após a tentativa do try ou
                // a caputra do erro com catch
            }finally {
                System.out.println("Continua o processo..");
            }

        }
    }
}
