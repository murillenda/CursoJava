package cursojava.algaworks.dataapinova.desafios.fusohorario;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA_FESTA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORA_FESTA = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FINAL_FORMARTTER = DateTimeFormatter
        .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm (zzzz)")
        .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        LocalDateTime dateTimeFesta = getDataHoraFesta();

        ZonedDateTime horarioPadraoFestaLocal = dateTimeFesta.atZone(ZoneId.systemDefault());

        System.out.println(horarioPadraoFestaLocal
            .withZoneSameInstant(ZoneId.of("America/Sao_Paulo"))
            .format(FINAL_FORMARTTER));

        System.out.println(horarioPadraoFestaLocal
            .withZoneSameInstant(ZoneId.of("America/Los_Angeles"))
            .format(FINAL_FORMARTTER));

        System.out.println(horarioPadraoFestaLocal
            .withZoneSameInstant(ZoneId.of("Japan"))
            .format(FINAL_FORMARTTER));
    }

    private static LocalDateTime getDataHoraFesta() {
        LocalDate dataFesta = getDataFesta("Data local da festa: ");
        LocalTime horaFesta = getHoraFesta("Horário local da festa: ");

        return dataFesta.atTime(horaFesta);
    }

    private static LocalTime getHoraFesta(String entrada) {
        while (true) {
            try {
                System.out.print(entrada);
                String horaFesta = ENTRADA.nextLine();

                return LocalTime.parse(horaFesta, FORMATADOR_HORA_FESTA);
            } catch (DateTimeParseException e) {
                System.out.println("Digite a hora corretamente (HH:mm)");
            }
        }
    }

    private static LocalDate getDataFesta(String entrada) {
        while (true) {
            try {
                System.out.print(entrada);
                String dataFesta = ENTRADA.nextLine();

                return LocalDate.parse(dataFesta, FORMATADOR_DATA_FESTA);
            } catch (DateTimeParseException e) {
                System.out.println("Digite a data corretamente (dd/mm/yyyy)");
            }
        }
    }
}
