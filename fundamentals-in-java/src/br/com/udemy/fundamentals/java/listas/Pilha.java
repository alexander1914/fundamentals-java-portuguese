package br.com.udemy.fundamentals.java.listas;

import java.util.ArrayList;
import java.util.List;

//TODO: Pilhas: São estruturas de dados onde o elemento que está visível/disponível é o que está sempre no topo.
// Os elementos, ao serem adicionados em um pilha, são adicionados sempre no topo.
// Para remover elementos da pilha, só podemos remover do topo.
// [2] -> este tenhos acesso.
// [1]
// [0]
public class Pilha {
    private List<String> nomes = new ArrayList<String>();
    //TODO: Pilha : é uma pilha sempre inserimos o elemento no TOPO.
    public void insere(String nome){
        this.nomes.add(nome);
    }
    //TODO: Pilha : é uma pilha sempre removemos o elemento que está no TOPO.
    public String remove(){
        return nomes.remove(nomes.size() - 1);
    }

    public String pegaTopo(){
        return nomes.get(nomes.size() - 1);
    }
    public boolean vazia(){
        return nomes.size() == 0;
    }
    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
