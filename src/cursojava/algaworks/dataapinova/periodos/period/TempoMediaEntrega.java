package cursojava.algaworks.dataapinova.periodos.period;

import java.time.LocalDate;
import java.time.Period;

public class TempoMediaEntrega {
    public static void main(String[] args) {
        Period tempoMediaEntrega = Period.parse("P1M5D");

        LocalDate hoje = LocalDate.now();
        LocalDate dataPrevistaEntrega = hoje.plus(tempoMediaEntrega);

        System.out.println(hoje);
        System.out.println(dataPrevistaEntrega);
    }
}
