package cursojava.algaworks.dataapislegado;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertendoStringParaDate {
    public static void main(String[] args) throws ParseException {
        String dataTexto = "30/12/2023";
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(format.parse(dataTexto));
    }
}
