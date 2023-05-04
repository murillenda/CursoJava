package cursojava.algaworks.dataapislegado;

import java.util.Calendar;

public class OperacoesDeData {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // calendar.set(Calendar.DAY_OF_MONTH, 20);

        // calendar.set(Calendar.MONTH, Calendar.DECEMBER); //Alterando para o Mês de dezembro
        calendar.add(Calendar.MONTH, 3); //Soma ao valor do mês, se quiser diminuir usar valor negativo.

        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); //Pegar ultimo dia do mes
        calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);

        System.out.println(calendar.getTime());
    }
}
