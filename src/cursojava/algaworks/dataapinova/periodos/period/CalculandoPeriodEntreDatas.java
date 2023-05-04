package cursojava.algaworks.dataapinova.periodos.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculandoPeriodEntreDatas {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

        // Period tempoEntrega = Period.between(dataCompra, dataEntrega); // tempo entre as datas
        Period tempoEntrega = dataCompra.until(dataEntrega); // Mesma coisa, porém mais limpo
        System.out.println(tempoEntrega);

        // Tempo em semanas da dataCompra até dataEntrega
        // long tempoEntregaSemanas = ChronoUnit.WEEKS.between(dataCompra, dataEntrega);
        long tempoEntregaSemanas = dataCompra.until(dataEntrega, ChronoUnit.WEEKS); // Mesma coisa
        System.out.println(tempoEntregaSemanas);
    }
}
