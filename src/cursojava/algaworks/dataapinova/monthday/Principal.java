package cursojava.algaworks.dataapinova.monthday;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Principal {
    public static void main(String[] args) {
        // Representação no ISO por exemplo do dia 07/04/2023 sem o ano: --04-07
        // Então assim que é representado o MonthDay
        MonthDay diaMesAtual = MonthDay.now();
        MonthDay diaAniversario = MonthDay.of(Month.SEPTEMBER, 13);
        MonthDay diaMesFromTemporalAccessor = MonthDay.from(LocalDate.now());
        MonthDay diaMesParse = MonthDay.parse("--04-07");


        System.out.println(diaMesAtual);
        System.out.println(diaAniversario);
        System.out.println(diaMesFromTemporalAccessor);
        System.out.println(diaMesParse);

        LocalDate dataAniversario = diaMesParse.atYear(2023); // Instancia um LocalDate com o diaMes informado + ano
        System.out.println(dataAniversario); // 2023-04-07

        LocalDate dataAniversarioOutroModo = Year.of(2023).atMonthDay(diaMesParse);  // Mesma coisa
        System.out.println(dataAniversarioOutroModo); // 2023-04-07
    }
}
