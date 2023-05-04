package cursojava.algaworks.dataapinova.instant;

import java.time.Instant;
import java.util.Date;

public class DateAntigoParaInstant {
    public static void main(String[] args) {
        Date data = new Date();

        Instant instant = data.toInstant(); // Passando a data para instant

        System.out.println(data);
        System.out.println(instant);
    }
}
