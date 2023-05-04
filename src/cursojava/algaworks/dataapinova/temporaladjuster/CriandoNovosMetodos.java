package cursojava.algaworks.dataapinova.temporaladjuster;

import java.time.LocalDate;

public class CriandoNovosMetodos {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();

        System.out.println(dataHoje);

        // Só um exemplo, pois a data do natal facilmente se pegaria utilizando withMonth e withDayOfMonth.
        LocalDate dataNatal = dataHoje.with(new NatalTemporalAdjuster());

        System.out.println(dataNatal);
    }
}
