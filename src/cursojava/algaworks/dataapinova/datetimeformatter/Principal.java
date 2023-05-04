package cursojava.algaworks.dataapinova.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();

        // DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        // O FormatStyle.FULL e o LONG aqui na parte de HORA, só é possível caso tenha o fuso horário

        /*
        DateTimeFormatter formatter = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT) // Passando Style's para o formatador
            .withLocale(Locale.US); // Passando Locale pro formatador
         */

        // Formatando do jeito que eu quiser, atenção as aspas simples para colocar coisas escritas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");

        System.out.println(dataHora);
        // System.out.println(formatter.format(dataHora)); // Formatando data hora com formatação pré pronta
        System.out.println(dataHora.format(formatter)); // Mesma coisa, mesmo resultado, porém no inverso.
    }
}
