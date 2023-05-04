package cursojava.algaworks.dataapinova.monthday;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class ValidandoMonthDay {
    public static void main(String[] args) {
        MonthDay diaMes = MonthDay.of(Month.FEBRUARY, 29);
        Year ano = Year.of(2024);

        // Verifica se é valido o dia 29 no ano de 2024
        System.out.println(ano.isValidMonthDay(diaMes)); // Resposta true, pois 2024 é um ano bissexto


    }
}
