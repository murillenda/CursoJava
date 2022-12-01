package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EParcelasMensaisDatas {
    public static void main(String[] args) throws ParseException {
        Date dateinicial = new SimpleDateFormat("dd/MM/yyyy") //data inicial
                .parse("21/07/2022");

        Calendar calendar = Calendar.getInstance(); //instancia o objeto calendar
        calendar.setTime(dateinicial); //instancia o objeto inicial

        for (int i = 1 ; i <= 12 ; i++) {
            calendar.add(Calendar.MONTH, 1); //adiciona um mês ao calendar
            //12 parcelas
            System.out.println("Parcela de número " + i + " vencimento é em: " +
                    new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }
    }
}
