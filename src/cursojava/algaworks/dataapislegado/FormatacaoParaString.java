package cursojava.algaworks.dataapislegado;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatacaoParaString {

    public static void main(String[] args) {

        Date hoje = new Date();

        // DateFormat format = DateFormat.getDateInstance(); // Vem data
        // DateFormat format = DateFormat.getDateTimeInstance(); // Vem data e hora
        // DateFormat format = DateFormat.getTimeInstance(); // Vem só o horário
        // DateFormat format = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT); // data e hora curtin bonito
        // DateFormat format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM); // data e hora medio
        // DateFormat format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG); // data e hora grande
        // DateFormat format = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL); // data e hora completa
        // DateFormat format = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.US); // data e hora completa + locale

        // Também podemos escolher o jeito da formatação
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(format.format(hoje));

    }

}
