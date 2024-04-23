package br.com.udemy.fundamentals.java.threads;
//TODO: Simulando da geração de relatório + barra de tarefas
// com a utilização de threads.

//TODO: Thread: é uma processamento em paralelo para uma execução de tarefas.
public class Threads {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);
        t1.start();

        GeraRelatorio relatorio = new GeraRelatorio();
        Thread t2 = new Thread(relatorio);
        t2.start();

    }
}
