package cursojava.algaworks.dataapinova.chronofield;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.parse("2023-10-04");
        long diaDoMes = ChronoField.DAY_OF_MONTH.getFrom(dataVencimento); // Pegar o dia do mês da dataVencimento
        long diaDoMess = dataVencimento.getLong(ChronoField.DAY_OF_MONTH); // A mesma coisa.
        long diaDoMesss = dataVencimento.getDayOfMonth(); // Mesma coisa, muito melhor

        System.out.println(diaDoMes);
        System.out.println(diaDoMess);
        System.out.println(diaDoMesss);

        LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-25T21:05:22");

        System.out.println(dataHoraCompra.getDayOfMonth());
        System.out.println(dataHoraCompra.getMonthValue());
        System.out.println(dataHoraCompra.getHour());
        System.out.println(dataHoraCompra.getMinute());
    }
}
