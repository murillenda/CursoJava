package cursojava.algaworks.dataapinova.obtendoastrestiposdedata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class PassandoLocalTimeEDateParaLocalDateTime {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2000, Month.MAY, 28);
        LocalTime hora = LocalTime.of(22, 55, 10);

        // LocalDateTime datahora = LocalDateTime.of(data, hora); // Nova LocalDateTime baseado na data e hora passadas
        // LocalDateTime datahora = data.atTime(hora); // A mesma coisa, porém mais simples e bonitin
        LocalDateTime datahora = hora.atDate(data); // A mesma coisa, porém passando inverso


        System.out.println(datahora);
    }
}
