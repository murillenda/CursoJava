package cursojava.algaworks.dataapinova.instant;

import java.time.Instant;

public class Instante {
    public static void main(String[] args) {
        Instant instant = Instant.now(); // Momento atual na linha do tempo

        System.out.println(instant.getEpochSecond()); // Segundos passados desde 1970
        System.out.println(instant.getNano()); // Nanossegundos para complementar uma precisão maior dos ms desde 1970

        System.out.println(instant.toEpochMilli()); // Millisegundos desde 1970
        System.out.println(System.currentTimeMillis()); // Mesmo resultado do toEpochMilli()
    }
}
