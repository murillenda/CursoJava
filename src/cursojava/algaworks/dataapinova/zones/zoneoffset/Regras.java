package cursojava.algaworks.dataapinova.zones.zoneoffset;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Regras {
    public static void main(String[] args) {
        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");

        ZoneOffset offsetSaoPaulo = fusoSaoPaulo.getRules()
            .getOffset(LocalDateTime.parse("2018-02-17T00:00:00")); // Se colocarmos dia 18, irá ser -03:00, pois não vai estar mais no horário de verão
        System.out.println(offsetSaoPaulo); // Representa -02:00, pois existia horário de verão e estava em horário de verão
    }
}
