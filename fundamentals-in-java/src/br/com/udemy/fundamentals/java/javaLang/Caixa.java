package br.com.udemy.fundamentals.java.javaLang;

//TODO: Caixa de Obejtos genéricos
public class Caixa {
    private Object[] objetos;
    private int posicaoLivre;

    public Caixa(){
        objetos = new Object[100];
        posicaoLivre = 0;
    }

    public void adicionar(Object novaConta){
        this.objetos[this.posicaoLivre] = novaConta;
        this.posicaoLivre++;
    }
    public Object pegar(int posicao){
        return this.objetos[posicao];
    }
}
