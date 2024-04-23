package br.com.udemy.fundamentals.java.threads;
//TODO: Simulando da geração de relatório + barra de tarefas
// sem a utilização de threads.
public class SimulandoExecucaoSemThread {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        barra.executa();

        GeraRelatorio relatorio = new GeraRelatorio();
        relatorio.executa();
    }
}
