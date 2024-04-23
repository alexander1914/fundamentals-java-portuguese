package br.com.udemy.fundamentals.java.threads;
//TODO: Para executar métodos em pararelo nossa classe deve implementar a interface Runnble,
// e o método que precisar ser executado em paralelo deve ser executado dentro método run().
public class GeraRelatorio implements Runnable {
    //TODO: run(): é responsável pela a execução do programa.
    @Override
    public void run() {
        //TODO: FOR 0 até 10 milhões
        for (int i = 0; i < 1000; i++){
            System.out.println(i + STR." - Gerando relatório... aguarde");
        }
    }
    public void executa() {
        //TODO: FOR 0 até 10 milhões
        for (int i = 0; i < 1000; i++){
            System.out.println(i + STR." - Gerando relatório... aguarde");
        }
    }
}
