package br.com.udemy.fundamentals.java.datas;

import java.time.*;
import java.time.format.DateTimeFormatter;

//TODO: Datas com os novos recurso a partir do Java 8

public class Datas {
    public static void main(String[] args) {
        //TODO: Formato ISO Internacional
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate anoNovo = LocalDate.of(2023, Month.JANUARY, 1);
        System.out.println(anoNovo);

        int ano = anoNovo.getYear();
        Month mes = anoNovo.getMonth();
        int dia = anoNovo.getDayOfMonth();

        System.out.println(STR."O Ano novo será em \{dia} de \{mes} de \{ano}");

        //TODO: Para trabalhar com periodos em Java para fazer calculos
        Period periodo = Period.between(hoje, anoNovo);
        System.out.println(periodo);

        System.out.println(STR."Faltam \{periodo.getYears()} ano \{periodo.getMonths()} meses e \{periodo.getDays()} dias");

        //TODO: Formatador para Datas em Java para definir o seu formato de horas
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        System.out.println(agora.format(formatador_horas));

        LocalTime intervalo = LocalTime.of(9,30);
        System.out.println(intervalo);
    }
}
