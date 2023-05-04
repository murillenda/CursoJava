package cursojava.algaworks.dataapislegado;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StringParaCalendar {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Data de nascimento: ");
        String dataAniversarioTexto = scanner.nextLine();

        Date dataAniversario = format.parse(dataAniversarioTexto);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataAniversario); // Seta a data que recebemos e passamos para date em Calendar

        System.out.println(calendar.getTime());

        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER
                && calendar.get(Calendar.DAY_OF_MONTH) == 25) {
            System.out.println("Você nasceu no natal! Ho ho ho");
        } else if (calendar.get(Calendar.DAY_OF_YEAR) == 256) {
            System.out.println("Você nasceu no dia do programador");
        }
    }
}
