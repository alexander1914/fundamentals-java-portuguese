package br.com.udemy.fundamentals.java.orientacao_objeto;

//TODO: Construtor é método especial que constroí a instância do objeto,
// regras:
// SEMPRE tem o mesmo nome da classe,
// podemos ter mais de um construtor na classe,
// Por padrão, a JVM - JAVA Virtual Machine, cria em tempo de execução um construtor padrão vazio
public class Construtor {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();//Método construtor()
        pessoa1.nome = "Nathália Vargas de Albuquerque Silva";
        pessoa1.email = "obr.nathi27@gmail.com";
        pessoa1.ano_nascimento = 1997;
        pessoa1.imprirInformacoes();

        //TODO: Usando um construtor com paramêtros
        Pessoa pessoa2 = new Pessoa("Alexander Albuquerque Oliveira",
                "alexander.oliveira99@gmail.com",1990);
        pessoa2.imprirInformacoes();
    }
}
