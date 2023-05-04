package cursojava.algaworks.dataapinova.stringparaobjetostemporais;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringParaLocalDateTime {
    public static void main(String[] args) {
        // Aqui não passamos o fuso horário, já que localDateTime não tem
        LocalDateTime localDateTime = LocalDateTime.parse("2026-10-03T21:03:19");

        LocalDateTime localDateTimeFormatted = LocalDateTime.parse("03/10/2026 21:03:19",
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(localDateTime);
        System.out.println(localDateTimeFormatted);
    }
}
