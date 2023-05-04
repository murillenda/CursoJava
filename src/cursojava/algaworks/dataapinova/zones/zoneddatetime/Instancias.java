package cursojava.algaworks.dataapinova.zones.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Instancias {
    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();
        ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoPadrao);
        System.out.println(dataHoraLosAngeles);

        System.out.println(dataHoraFusoPadrao.getOffset()); // Retorna o OffSet
        System.out.println(dataHoraFusoPadrao.getZone()); // Retorna a zona
    }
}
