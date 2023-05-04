package cursojava.algaworks.dataapinova.chronounit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculandoObjetosTemporais {
    public static void main(String[] args) {
        // Existem, mas os métodos de conveniência são melhores.
        LocalDate agora = LocalDate.now();

        // Aqui fazemos informando o DAYS que é o campo que queremos adicionar
        // Nome desse método é addTo, porém não adiciona, ele cria uma cópia fazendo o calculo do amount
        // LocalDate dataProximoParcela = ChronoUnit.DAYS.addTo(agora, 1);
        LocalDate dataProximoParcela = agora.plus(30, ChronoUnit.DAYS); // Essa forma é mais legivel
        LocalDate umaDecadaAMenosDeAgora = agora.minus(1, ChronoUnit.DECADES);

        System.out.println(umaDecadaAMenosDeAgora);
        System.out.println(agora);
        System.out.println(dataProximoParcela);
    }
}
