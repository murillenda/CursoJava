package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ADatasEmJava {
    public static final String resetColor = "\u001B[0m";
    public static final String corVermelha = "\u001B[31m";
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();

        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println(corVermelha + "Calendar em milisegundos: " + calendar.getTimeInMillis() + resetColor);

        System.out.println("Dia do mês: " + date.getDate());
        System.out.println(corVermelha + "Calendar do dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH) + resetColor);

        System.out.println("Dia da semana: " + date.getDay());
        System.out.println(corVermelha + "Calendar do dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1) + resetColor);

        System.out.println("Horas do dia: " + date.getHours());
        System.out.println(corVermelha + "Calendar horas do dia: " + calendar.get(Calendar.HOUR_OF_DAY) + resetColor);

        System.out.println("Minuto da hora: " + date.getMinutes());
        System.out.println(corVermelha + "Calendar minuto do dia: " + calendar.get(Calendar.MINUTE) + resetColor);

        System.out.println("Segundos: " + date.getSeconds());
        System.out.println(corVermelha + "Calendar segundos do dia: " + calendar.get(Calendar.SECOND) + resetColor);

        System.out.println("Ano: " + (date.getYear() + 1900));
        System.out.println(corVermelha + "Calender ano: " + calendar.get(Calendar.YEAR) + resetColor);

        /*-------------------------Simple Date Format--------------------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");

        System.out.println("Data atual em formato padrao e String: " + simpleDateFormat.format(date));
        System.out.println(corVermelha + "Calendar Data atual em formato padrao e String: " + simpleDateFormat.format(calendar.getTime()) + resetColor);

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.SS");

        System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
        System.out.println(corVermelha + "Calendar Data em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()) + resetColor);

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18"));

        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Objeto Date: " + simpleDateFormat.parse("18/10/1987"));
    }
}
