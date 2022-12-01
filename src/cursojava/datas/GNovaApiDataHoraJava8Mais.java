package cursojava.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GNovaApiDataHoraJava8Mais {
    public static void main(String[] args) {
        /*Nova API de datas do java, a partir do 8*/

        LocalDate dataAtual = LocalDate.now(); //Data atual
        System.out.println("Data atual: " + dataAtual
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalTime horaAtual = LocalTime.now(); //Hora atual

        System.out.println("Hora atual: " + horaAtual
                .format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        LocalDateTime dataHoraAtual = LocalDateTime.now();

        System.out.println("DataHoraAtual: " + dataHoraAtual
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
