package cursojava.algaworks.dataapislegado.desafio;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadorParcelas {

    private CalculadorParcelas() {}

    public static List<String> calcular(Date date, Integer parcelas, DateFormat formatador) {
        List<String> listaParcelas = new ArrayList<>();
        Calendar calendarMexer = Calendar.getInstance();
        calendarMexer.setTime(date);

        Calendar calendarCopy = Calendar.getInstance();
        calendarCopy.setTime(date);

        for (int i = 1; i <= parcelas; i++) {
            Date data = calendarMexer.getTime();
            calendarMexer.add(Calendar.MONTH, i - 1);
            listaParcelas.add(formatador.format(data));
        }

        return listaParcelas;
    }

}
