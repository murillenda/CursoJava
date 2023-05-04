package cursojava.algaworks.dataapislegado;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ComparacaoDatas {
    public static void main(String[] args) {
        Calendar minhaDataNascimento = new GregorianCalendar(2000, Calendar.MAY, 28);
        Calendar dataNascimentoJoao = new GregorianCalendar(2006, Calendar.MAY, 29);

        if (dataNascimentoJoao.before(minhaDataNascimento)) {
            System.out.println("João é mais velho");
        }

        if (dataNascimentoJoao.after(minhaDataNascimento)) {
            System.out.printf("João é mais novo");
        }

        if (dataNascimentoJoao.compareTo(minhaDataNascimento) == 0) {
            System.out.println("João nascue no mesmo dia");
        }
    }
}
