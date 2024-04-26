package br.com.udemy.fundamentals.java.listas;
//TODO: Classe: que representa uma célula (Container) onde teremos o objeto (valor)
// e uma celula que será a ligação para o próximo.
// [0][3][1][2][5][4][null]
public class Celula {
    private Object elemento;
    private Celula proximo;
    private Celula anterior;

    public Celula(Object elemento, Celula proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula (Object elemento){
        this(elemento, null);
    }
    public Celula getProximo(){
        return this.proximo;
    }
    public void setProximo(Celula proximo){
        this.proximo = proximo;
    }
    public Object getElemento(){
        return this.elemento;
    }
    public Celula getAnterior(){
        return this.anterior;
    }
    public Celula setAnterior(Celula anterior){
       return this.anterior = anterior;
    }
}
