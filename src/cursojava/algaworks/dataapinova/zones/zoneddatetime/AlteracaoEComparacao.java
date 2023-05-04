package cursojava.algaworks.dataapinova.zones.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AlteracaoEComparacao {
    public static void main(String[] args) {
        ZonedDateTime dataFestaSaoPaulo = ZonedDateTime
            .parse("2023-09-13T20:00:00-03:00[America/Sao_Paulo]");

        // Trava a data hora
        //ZonedDateTime dataFestaLosAngeles = dataFestaSaoPaulo
          //  .withZoneSameLocal(ZoneId.of("America/Los_Angeles"));

        // Altera a data hora para o local em específico
        ZonedDateTime dataFestaLosAngeles = dataFestaSaoPaulo
            .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataFestaSaoPaulo);
        System.out.println(dataFestaLosAngeles);

        System.out.println(dataFestaSaoPaulo.equals(dataFestaLosAngeles)); // Compara o conteúdo
        System.out.println(dataFestaSaoPaulo.isEqual(dataFestaLosAngeles)); // é sempre melhor usar o isEqual, que compara melhor
    }
}
