package cursojava.algaworks.dataapinova.zones.offsetdatetime;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal {
    public static void main(String[] args) {
        OffsetDateTime dataHora = OffsetDateTime.now();
        OffsetDateTime dataHoraZoneId = OffsetDateTime
            .now(ZoneId.of("America/Los_Angeles")); // Podemos passar o nome de um Fuso horário mesmo sem ele ter fuso,
                                                    // pois quando instanciamos um offSet assim, ele converte isso em um
                                                    // offSet, resolve isso cmoo offSet no caso.

        // Instancia 5 horas pra frente do UTC.
        OffsetDateTime dataHoraOfHours = OffsetDateTime.now(ZoneOffset.ofHours(5));
        OffsetDateTime dataHoraParse = OffsetDateTime.parse("2023-01-13T20:00:00-03:00");

        //Tem minus, plus, with e etc também

        System.out.println(dataHora);
        System.out.println(dataHora.getOffset()); // Não tem o fuso horário, mas tem o Offset
        System.out.println(dataHoraZoneId);
        System.out.println(dataHoraOfHours);
        System.out.println(dataHoraParse);
    }
}
