package cursojava.algaworks.dataapinova.obtendoastrestiposdedata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExtracaoLocalDateETimeDeLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        // LocalDate data = dateTime.toLocalDate(); // Extraimos o LocalDate de LocalDateTime (pega só a data)
        LocalDate data = LocalDate.from(dateTime); // Podemos fazer o inverso também, resultado é o mesmo

        // LocalTime hora = dateTime.toLocalTime(); // Estraímos o LocalTime de LocalDateTime (pega só a hora)
        LocalTime hora = LocalTime.from(dateTime); // Podemos fazer o inverso também, resultado é o mesmo

        System.out.println(data);
        System.out.println(hora);
    }
}
