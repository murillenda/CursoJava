package cursojava.algaworks.dataapinova.dayofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        // Modos de obter instância de DayOfWeek
        DayOfWeek diaDaSemana = DayOfWeek.MONDAY; // MONDAY
        DayOfWeek diaDaSemanaNumero = DayOfWeek.of(1); // MONDAY
        DayOfWeek diaDaSemanaPassandoTemporalAccessor = DayOfWeek.from(LocalDate.now()); // DIa da semana hoje
        DayOfWeek diaDaSemanaHojeDiferente = LocalDate.now().getDayOfWeek(); // Dia da semana hoje

        System.out.println(diaDaSemana);
        System.out.println(diaDaSemanaNumero);
        System.out.println(diaDaSemanaPassandoTemporalAccessor);
        System.out.println(diaDaSemanaHojeDiferente);

        // NARROW -> Q
        // SHORT -> qui
        // FULL -> quinta-feita
        System.out.println("Descrição bonitinha dia da semana: " + diaDaSemanaHojeDiferente
            .getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

        // e -> 5
        // E -> qui.
        // EEEE -> quinta-feira
        System.out.println(DateTimeFormatter.ofPattern("E")
            .withLocale(new Locale("pt", "BR"))
            .format(diaDaSemanaHojeDiferente));
    }
}
