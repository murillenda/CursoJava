package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BAfterBeforeData {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");

        Date dateAtualHoje = simpleDateFormat.parse("07/04/2021");

        //After: data 1 maior que data 2
        //Before: data 1 menor que data 2

        //se a data 1 é maior que a data 2
        if (dataVencimentoBoleto.after(dateAtualHoje)) {
            System.out.println("Boleto em Aberto");
        } else {
            System.out.println("Boleto  - Urgente");
        }
    }
}
