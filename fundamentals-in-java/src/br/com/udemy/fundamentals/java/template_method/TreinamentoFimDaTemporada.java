package br.com.udemy.fundamentals.java.template_method;

public class TreinamentoFimDaTemporada extends Treinamento{
    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico de fim da temporada...");
    }
    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de fim da temporada...");
    }
}
