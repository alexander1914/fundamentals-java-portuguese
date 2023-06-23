package br.com.udemy.fundamentals.java.atributos_metodos_estaticos;
//TODO: Métodos Estáticos: não depende de uma instância da classe para ser utilizado.
// Pode-se utilizar conforme:
// Ex: NomeDaClasse.metodo();
public class MetodosEstaticos {
    public static void main(String[] args) {
        Conta conta = new Conta("Eduardo Pires");
        System.out.println("Número da conta: " + conta.getNumero());
        System.out.println("Cliente: " + conta.getCliente());

        //TODO: Acessando um método estatico da Classe CONTA:
        System.out.println("Qual é numero da próxima conta: " + Conta.proximaConta());
    }
}
