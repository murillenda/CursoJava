package cursojava.datas;

import java.time.Duration;
import java.time.Instant;

public class HTempoProcessoInstant {
    public static void main(String[] args) throws InterruptedException {
        Instant inicio = Instant.now();

        Thread.sleep(10000);

        Instant ifinal = Instant.now();

        Duration duration = Duration.between(inicio, ifinal);

        System.out.println("Duração em nano segundos grandes(long): " + duration.toNanos());
        System.out.println("Duração em nano segundos pequenos(int): " + duration.toNanosPart());

        System.out.println("Duração em dias grandes(long): " + duration.toDays());
        System.out.println("Duração em dias pequenos(int): " + duration.toDaysPart());

        System.out.println("Duração em horas grandes(long): " + duration.toHours());
        System.out.println("Duração em horas pequenos(int): " + duration.toHoursPart());

        System.out.println("Duração em minutos grandes(long): " + duration.toMinutes());
        System.out.println("Duração em minutos pequenos(int): " + duration.toMinutesPart());

        System.out.println("Duração em milisegundos grandes(long): " + duration.toMillis());
        System.out.println("Duração em milisegundos pequenos(int): " + duration.toMillisPart());
    }
}
