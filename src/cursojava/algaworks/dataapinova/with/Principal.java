package cursojava.algaworks.dataapinova.with;

import java.time.LocalDateTime;
public class Principal {
    public static void main(String[] args) {
        LocalDateTime dataHoraAgora = LocalDateTime.now();

        // Cria uma cópia desse LocalDateTime, pois LocalDateTime é imutavel
        // LocalDateTime novaDataHora = dataHoraAgora.with(ChronoField.DAY_OF_MONTH, 9);
        LocalDateTime novaDataHora = dataHoraAgora
            .withDayOfMonth(9) // Mesma coisa, só que mais bonito
            .withMinute(0) // Coloca minutos 0
            .withSecond(0); // Coloca segundos 0

        System.out.println(novaDataHora);
    }
}
