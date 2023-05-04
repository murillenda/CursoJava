package cursojava.algaworks.dataapinova.desafios.agendamentoevento;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_FULLDATE_SHORTDATE = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
        .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        LocalDate dataEvento = getEventLocalDate("Data do evento: ");
        LocalTime horaEvento = getEventLocalTime("Hora do evento: ");

        LocalDateTime dataHoraEvento = dataEvento.atTime(horaEvento);

        System.out.printf("Evento agendado para %s%n",  dataHoraEvento.format(FORMATADOR_FULLDATE_SHORTDATE));
    }

    private static LocalDate getEventLocalDate(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataEvento = ENTRADA.nextLine();

                return LocalDate.parse(dataEvento, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private static LocalTime getEventLocalTime(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String horaEvento = ENTRADA.nextLine();

                return LocalTime.parse(horaEvento, FORMATADOR_HORARIO);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }
}
