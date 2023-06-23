package br.com.udemy.fundamentals.java.interfaces;

//TODO: Interface: pode conter constantes e métodos abstratos
public interface IEletronico {

    //TODO: Interface, para servir de contrato para produtos eletrônicos
    //Todo produto eletrônico que implementar está interface(OBRIGATÓRIAMENTE) deverão
    // implementar os métodos abstratos.
    String MARCA = "Moundial";
    void ligar();
    void desligar();
}
