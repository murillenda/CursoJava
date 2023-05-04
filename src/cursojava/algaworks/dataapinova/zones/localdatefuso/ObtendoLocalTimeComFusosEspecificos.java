package cursojava.algaworks.dataapinova.zones.localdatefuso;

import java.time.LocalTime;
import java.time.ZoneId;

public class ObtendoLocalTimeComFusosEspecificos {
    public static void main(String[] args) {
        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoJapao = ZoneId.of("Japan");
        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");

        LocalTime horaLosAngeles = LocalTime.now(fusoLosAngeles);
        LocalTime horaJapao = LocalTime.now(fusoJapao);
        LocalTime horaSaoPaulo = LocalTime.now(fusoSaoPaulo);

        System.out.println(horaLosAngeles);
        System.out.println(horaJapao);
        System.out.println(horaSaoPaulo);
    }
}
