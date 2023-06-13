package br.com.udemy.fundamentals.java.orientacao_objeto;

//TODO: Objetos são produtos/instâncias da classe
public class Objeto {
    public static void main(String[] args) {
        //TODO: Declaração e instanciação do objeto
        Produto produto = new Produto();//Construtor
        produto.nome = "Caneta BIC";
        produto.preco = 3.99f;
        produto.desconto = 10.0f;

        System.out.println("================ Produtos =================");
        System.out.println(produto.nome);
        System.out.println("R$ " + produto.preco);
        System.out.println(produto.desconto + "%");
        System.out.println("");

        Pessoa pessoa = new Pessoa();//Construtor
        pessoa.nome = "Alexander Albuquerque Oliveira";
        pessoa.email = "alexander.oliveira99@gmail.com";
        pessoa.ano_nascimento = 1990;

        System.out.println("================ Pessoa ===================");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("E-mail: " + pessoa.email);
        System.out.println("Ano de Nascimento: " + pessoa.ano_nascimento);

    }
}
