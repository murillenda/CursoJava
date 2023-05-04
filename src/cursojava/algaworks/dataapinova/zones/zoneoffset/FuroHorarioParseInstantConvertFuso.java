package cursojava.algaworks.dataapinova.zones.zoneoffset;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FuroHorarioParseInstantConvertFuso {
    public static void main(String[] args) {
        // Lembrando que trabalha com UTC
        Instant instante = Instant.now();
        System.out.println(instante);

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        LocalDateTime dataHora = LocalDateTime.ofInstant(instante, fusoSaoPaulo); // Passando o Instant para dataHora do fuso passado

        System.out.println(dataHora);
    }
}
