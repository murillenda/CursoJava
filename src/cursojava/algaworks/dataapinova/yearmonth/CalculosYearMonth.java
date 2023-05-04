package cursojava.algaworks.dataapinova.yearmonth;

import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class CalculosYearMonth {
    public static void main(String[] args) {
        YearMonth anoMes = YearMonth.parse("2023-09");
        // Não pode usar, pois tem DIAS, e ano mes não tem dias
        // YearMonth anoMesFuturo  = anoMes.plus(Period.parse("P10D"));
        YearMonth anoMesFuturo  = anoMes.plus(Period.parse("P2Y5M")); // Soma 2 anos e 5 meses através de periodo
        YearMonth anoMesFuturoChronoUnit = anoMes.plus(2, ChronoUnit.CENTURIES); // Soma 2 séculos
        YearMonth anoMesFuturoMetodoConveniencia = anoMes.plusYears(10); // Soma 10 anos

        System.out.println(anoMesFuturo);
        System.out.println(anoMesFuturoChronoUnit);
        System.out.println(anoMesFuturoMetodoConveniencia);

        // Tempo em meses de anoMes até outubro de 2025.
        long tempoEmMeses = anoMes.until(YearMonth.of(2025, 10), ChronoUnit.MONTHS);
        System.out.println(tempoEmMeses);

        // Mesma coisa do de cima, porém passando um localDate
        long tempoEmMesesLocalDate = anoMes.until(LocalDate.parse("2025-10-15"), ChronoUnit.MONTHS);
        System.out.println(tempoEmMesesLocalDate);
    }
}
