package cursojava.algaworks.dataapinova.periodos.duration;

import java.time.Duration;

public class Principal {
    public static void main(String[] args) {
        Duration duracao = Duration.ofHours(5);
        Duration duracaoDias = Duration.ofDays(5); //Converte os dias para horas
        Duration stringParaDuration = Duration.parse("PT5H");
        Duration stringParaDurationColocandoDias = Duration.parse("P1DT5H"); //Converte os dias para horas


        System.out.println(duracaoDias);
        System.out.println(duracao);
        System.out.println(stringParaDuration);
        System.out.println(stringParaDurationColocandoDias);

        // Duration duracaoCalculada = duracao.plus(Duration.ofMinutes(30));
        // Duration duracaoCalculada = duracao.plusMinutes(10);
        // Duration duracaoCalculada = duracao.multipliedBy(2);
        Duration duracaoCalculada = duracao.dividedBy(2);
        System.out.println(duracaoCalculada);

        System.out.printf("Número de segundos: %d%n", duracaoCalculada.getSeconds());
        System.out.printf("Conversão de duração inteira para minutos: %d%n", duracaoCalculada.toMinutes());

        System.out.printf("Parte dos minutos no tempo: %d%n", duracaoCalculada.toMinutesPart());
    }
}
