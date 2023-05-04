package cursojava.algaworks.dataapinova.temporaladjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate primeiraSegundaProximoMes = dataHoje
            .plusMonths(1) // Pega a data de hoje, soma 1 mês
            .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // Pegamos o with para usar TemporalAdjuster
                                                                     // para pegar a primeira segunda feira do próximo mes

        LocalDate ultimoDiaDoMes = dataHoje.with(TemporalAdjusters.lastDayOfMonth()); // Último dia do mês da data de hoje

        LocalDate proximaSextaFeira = dataHoje
            .with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); //Pega a data da próxima sexta feira

        LocalDate proximaSextaFeiraOuHojeCasoForSexta = dataHoje
            .with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)); //Pega a data da próxima sexta feira e se hoje for sexta
                                                              // Ele pega a do dia de hoje

        System.out.println(primeiraSegundaProximoMes);
        System.out.println(ultimoDiaDoMes);
        System.out.println(proximaSextaFeira); // Retorna somente a próxima sexta, mesmo se hoje for sexta
        System.out.println(proximaSextaFeiraOuHojeCasoForSexta); // Retorna hoje se for sexta, se não a próxima
    }
}
