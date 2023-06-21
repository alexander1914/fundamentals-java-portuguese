package br.com.udemy.fundamentals.java.template_method;
//TODO: Template Method: o padrão Template Method define o esqueleto de um algoritimo,
// dentro de um método tranferindo alguns de seus passos para as subclasses.
// O Template Method permite que as subclasses refefinam certos passos de um,
// algoritimo sem alterar a estrutura próprio algoritimo.

//TODO: Algoritimo: são "receitas" passo-passo resolver algum problema.
// receber numero
// retornar numero * numero

public class TemplateMethod {
    public static void main(String[] args) {
        TreinamentoInicioDaTemporada inicioDaTemporada = new TreinamentoInicioDaTemporada();
        inicioDaTemporada.TreinoDiario();

        TreinamentoFimDaTemporada fimDaTemporada = new TreinamentoFimDaTemporada();
        fimDaTemporada.TreinoDiario();
    }
}
