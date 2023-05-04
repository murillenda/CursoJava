package cursojava.algaworks.dataapislegado;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendario {
    public static void main(String[] args) {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Calendar calendar = Calendar.getInstance(); //Pega momento atual
        // Calendar calendar = new GregorianCalendar(1981, Calendar.SEPTEMBER, 13); //Subclasse de calendar que é o calendario padrao
        Calendar calendar = new GregorianCalendar(1981, Calendar.SEPTEMBER, 13,
            13, 20, 35);
        Date data = calendar.getTime();

        System.out.println(formatador.format(data));
    }
}
