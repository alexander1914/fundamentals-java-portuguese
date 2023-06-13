package br.com.udemy.fundamentals.java.orientacao_objeto;
public class Produto {
    //TODO: Classes representam um objeto contendo atributos e metódos

    //TODO: Atributos são características da classe(modelo de dados)

    //TODO: Métodos são as ações que é realizada por um objeto da classe,
    // podemos entender também que os métodos são comportamentos dos objetos da classe.
    String nome;
    float preco;
    float desconto;

    //TODO: Método para aumentar o preço do projeto em 10
    void aumentarPreco(float valor){
        this.preco = this.preco + valor;
    }
}
