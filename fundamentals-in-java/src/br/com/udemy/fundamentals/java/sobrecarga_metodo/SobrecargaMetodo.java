package br.com.udemy.fundamentals.java.sobrecarga_metodo;

//TODO: Sobrecarga de Método: é quando sobreescrevemos um método na mesma classe de declaração
// Oveloanding
// Regra: para funcionar a sobrecarga sempre com paramêtros diferentes

import br.com.udemy.fundamentals.java.heranca.Pessoa;

public class SobrecargaMetodo {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Alexander Oliveira",
                1990,
                "alexander.oliveira99@gmail.com"
        );

        pessoa.mensagem();
        pessoa.mensagem("Exemplo de uma sobrecarga de método");

    }
}
