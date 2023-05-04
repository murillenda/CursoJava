package cursojava.algaworks.dataapinova.instant;

import java.time.Instant;
import java.util.Date;

public class InstanteParaDateAntiga {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        Date data = Date.from(instant); //Instant na api de data antiga

        System.out.println(instant);
        System.out.println(data);
    }
}
