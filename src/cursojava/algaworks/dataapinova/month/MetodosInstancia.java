package cursojava.algaworks.dataapinova.month;

import java.time.Month;

public class MetodosInstancia {
    public static void main(String[] args) {
        // Ano bissexto true
        // Devolve qual é o dia do ano que é o 1° de Dezembro e ano bissexto
        System.out.println(Month.DECEMBER.firstDayOfYear(true));

        // Ano bissexto false
        // Devolve qual é o dia do ano que é o 1° de Dezembro e não é ano bissexto
        System.out.println(Month.DECEMBER.firstDayOfYear(false));

        // Tamanho do mês de fevereiro e não é ano bissexto
        System.out.println(Month.FEBRUARY.length(false));

        // Tamanho do mês de fevereiro e é um ano bissexto
        System.out.println(Month.FEBRUARY.length(false));

        // Devolve qual é o primeiro mês do trimestre que fevereiro está
        System.out.println(Month.SEPTEMBER.firstMonthOfQuarter());
    }
}
