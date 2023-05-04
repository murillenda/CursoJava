package cursojava.algaworks.dataapinova.periodos.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DuracaoEntreObjetos {
    public static void main(String[] args) {
        LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-12T21:30:00");
        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2022-11-12T22:10:10");

        // Caso usar isso com LocalDate, recebe uma exception, pois LocalDate não possui horário
        Duration tempoEntrega = Duration.between(dataHoraCompra, dataHoraEntrega);
        System.out.println(tempoEntrega);

        // long tempoEntregaSegundos = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.SECONDS);
        long tempoEntregaSegundos = ChronoUnit.SECONDS.between(dataHoraCompra, dataHoraEntrega);

        System.out.println(tempoEntregaSegundos);
    }
}
