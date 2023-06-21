package br.com.udemy.fundamentals.java.template_method;

public class TreinamentoInicioDaTemporada extends Treinamento{
    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico de ínicio da temporada...");
    }
    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de ínicio da temporada...");
    }
}
