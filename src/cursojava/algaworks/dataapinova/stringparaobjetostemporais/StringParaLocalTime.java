package cursojava.algaworks.dataapinova.stringparaobjetostemporais;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringParaLocalTime {
    public static void main(String[] args) {
        // Mesmo principio do LocalDate, porém para Hora
        LocalTime horario = LocalTime.parse("21:03:19");
        LocalTime horarioFormatted = LocalTime.parse("21-03-19",
            DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(horario);
        System.out.println(horarioFormatted);
    }
}
