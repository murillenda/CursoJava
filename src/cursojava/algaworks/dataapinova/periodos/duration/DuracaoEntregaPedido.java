package cursojava.algaworks.dataapinova.periodos.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DuracaoEntregaPedido {
    public static void main(String[] args) {
        Duration tempoMedioEntrega = Duration.parse("PT45M");
        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime dataHoraEntregaPrevista = agora
            .plus(tempoMedioEntrega)
            .truncatedTo(ChronoUnit.MINUTES); // Truncar a partir dos minutos (remove minutos, segundos e ms)

        System.out.println(agora);
        System.out.println(dataHoraEntregaPrevista);
    }
}
