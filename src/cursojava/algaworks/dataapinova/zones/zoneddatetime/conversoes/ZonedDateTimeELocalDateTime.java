package cursojava.algaworks.dataapinova.zones.zoneddatetime.conversoes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeELocalDateTime {
    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoPadrao =  ZonedDateTime.now();

        // ZonedDateTime para LocalDateTime
        LocalDateTime dataHoraSemFuso = dataHoraFusoPadrao.toLocalDateTime();

        // Convertendo LocalDateTime para ZonedDateTime para o meu fuso padrão do sistema.
        //ZonedDateTime dataHoraFuso = ZonedDateTime
            //.of(dataHoraSemFuso, ZoneId.systemDefault());

        // Mesma coisa do outro, porém mais reduzido
        ZonedDateTime dataHoraFuso = dataHoraSemFuso
            .atZone(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoPadrao);
        System.out.println(dataHoraSemFuso);
        System.out.println(dataHoraFuso);
    }
}
