package br.com.udemy.fundamentals.java.modificadores_acesso;

//TODO: Protected(protegido): o modificador de acesso Protected faz com que
// o elemento seja visível somente dentro do mesmo pacote
// onde o elemento foi declarado
// é o modificador de acesso Padrão(default)
public class Protected {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    //TODO: Protected
    protected void nomeCompleto(){
        System.out.println(this. nome + this.sobrenome);
    }
}
