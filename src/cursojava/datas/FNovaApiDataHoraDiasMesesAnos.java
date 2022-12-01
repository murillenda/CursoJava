package cursojava.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FNovaApiDataHoraDiasMesesAnos {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("Data atual: " + localDate
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Dia da semana: " + localDate.getDayOfWeek());
        System.out.println("Dia do mês: " + localDate.getDayOfMonth());
        System.out.println("Número do dia do mês: " + localDate.getMonthValue());
        System.out.println("Dia do ano: " + localDate.getDayOfYear());
        System.out.println("Era: " + localDate.getEra());
        System.out.println("Cronologia: " + localDate.getChronology());
        System.out.println("Dias do mês atual: " + localDate.lengthOfMonth());
    }
}
