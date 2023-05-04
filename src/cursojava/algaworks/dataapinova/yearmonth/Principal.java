package cursojava.algaworks.dataapinova.yearmonth;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Principal {
    public static void main(String[] args) {
        YearMonth anoMes = YearMonth.now();
        YearMonth anoMesOf = YearMonth.of(2022, Month.SEPTEMBER);
        YearMonth anoMesFromDate = YearMonth.from(LocalDate.now());
        YearMonth anoMesParse = YearMonth.parse("2023-09");

        System.out.println(anoMes);
        System.out.println(anoMesOf);
        System.out.println(anoMesFromDate);
        System.out.println(anoMesParse);

        // Retorna um LocalDate com o dia específico.
        LocalDate dataAniversario = anoMes.atDay(13);
        System.out.println(dataAniversario);

        // Retorna o último dia do mês válido desse mês atual
        LocalDate dataUltimoDiaMes = anoMes.atEndOfMonth();
        System.out.println(dataUltimoDiaMes);
    }
}
