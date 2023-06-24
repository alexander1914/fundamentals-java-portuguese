package br.com.udemy.fundamentals.java.try_catch;
//TODO: Tratando excecoes com try/catch
// Try: Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que
// pode acarretar em um problema.
// Catch: Utilizamos o catch para capturar o erro e com isso oferecer ao usuário do sistema,
// uma mensagem adequada sem que o sistema quebre.
public class TryCatch {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3 * 2;
        }

        for (int i = 0; i <= numeros.length; i++){
            //TODO: Try é Tente fazer isso
            try{
                System.out.println(numeros[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Você está tentando acessar um posicão do array" +
                        "que não existe..");
            }

        }
    }
}
