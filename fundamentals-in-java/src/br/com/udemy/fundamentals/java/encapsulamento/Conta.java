package br.com.udemy.fundamentals.java.encapsulamento;

//TODO: Getters e Setters
// Getter: é um método público, que serve para consultar dados, a nomenclatura desses
// métodos é get _nome_do_atributo.
public class Conta {

    //TODO: Encapsulamento: Tem como premissa proteger(capsula) atritubos/propriedades de uma classe,
    // fazendo com que as alterações sejam feitas apenas por métodos definidos na própria classe.
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    //TODO: Método getter do atributo Saldo
    /**
     * Métdo getter do atributo Saldo
     *
     * @return a soma do saldo + limite
     */
    public float getSaldo(){
        return this.saldo;
    }

    //TODO: Métodos
    public void sacar(float valor){
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso...");
        }else if(valor <= (this.saldo + this.limite)){
            //TODO: Calculando o valor excendente do saque
            float val_ret = this.saldo - valor;

            if (val_ret < 0){
                this.saldo = 0;
            }

            val_ret = this.limite - val_ret;
            this.limite = val_ret;
            System.out.println("Saque realizado com sucesso...");
        }else{
            System.out.println("Saldo insuficiente: " + saldo);
        }

    }

    //TODO: Aplicando o Javadoc
    /**
     * Método para realizar um depósito
     * @param valor a ser depositado
     */
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }
}
