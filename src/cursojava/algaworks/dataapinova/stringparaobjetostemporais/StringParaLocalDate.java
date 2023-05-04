package cursojava.algaworks.dataapinova.stringparaobjetostemporais;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringParaLocalDate {
    public static void main(String[] args) {
        // Funciona como o Instant, porém não requer Fuso horário e não recebe hora
        LocalDate data = LocalDate.parse("2026-10-03");
        LocalDate dataComFormatacao = LocalDate.parse("03/10/2026",
            DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(data);
        System.out.println(dataComFormatacao);
    }
}
