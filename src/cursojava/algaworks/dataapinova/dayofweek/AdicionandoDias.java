package cursojava.algaworks.dataapinova.dayofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class AdicionandoDias {
    public static void main(String[] args) {
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();
        DayOfWeek diaDaSemanaQuinzeDias = diaDaSemana.plus(15); // Adiciona 15 dias no dia da semana atual

        System.out.println(diaDaSemana);
        System.out.println(diaDaSemanaQuinzeDias);
    }
}
