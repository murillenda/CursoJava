package cursojava.algaworks.dataapinova.instant;

import java.time.Instant;
import java.util.Calendar;

public class CalendarParaInstant {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Instant instant = calendar.toInstant(); //Conversão do calendar para instant

        System.out.println(calendar.getTime());
        System.out.println(instant);
    }
}
