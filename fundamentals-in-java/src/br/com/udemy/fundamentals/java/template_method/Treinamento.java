package br.com.udemy.fundamentals.java.template_method;
//TODO: Template Method

//TODO: Final: é um modificador de acesso que faz com o elemento que esteja utilizado,
// não possa ser extendido/reecrito.
public abstract class Treinamento {
    //TODO: Template Method
    public final void TreinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();
    public abstract void jogoTreino();
    public final void treinoTatico(){
        System.out.println("Treino tático...");
        System.out.println();
    }
}
