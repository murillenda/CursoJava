package cursojava.algaworks.dataapinova.month;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.parse("1981-09-13");

        Month mes = Month.SEPTEMBER; // Instancia de mês
        Month mesOf = Month.of(9); // Mês 9 que se refere a setembro.
        Month mesFromTemporal = Month.from(dataNascimento);
        Month mesMelhorJeito = dataNascimento.getMonth();

        System.out.println(mes);
        System.out.println(mesOf);
        System.out.println(mesFromTemporal);
        System.out.println(mesMelhorJeito);

        // Deixar o nome bonito
        System.out.println(mes.getDisplayName(TextStyle.FULL, Locale.US)); // September

        // M = 9
        // MM = 09
        // MMMM = September
        System.out.println(DateTimeFormatter.ofPattern("MMMM")
            .withLocale(Locale.US)
            .format(mes));
    }
}
