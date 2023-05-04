package cursojava.algaworks.dataapinova.zones.zoneddatetime.conversoes;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeEInstant {
    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime
            .parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        // Convertendo ZonedDateTime para Instant
        Instant instante = dataHoraFusoSaoPaulo.toInstant();

        LocalDateTime dataHoraLosAngeles = LocalDateTime
            .ofInstant(instante, ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoSaoPaulo);
        System.out.println(instante);
        System.out.println(dataHoraLosAngeles);
    }
}
