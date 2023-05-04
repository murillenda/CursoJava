package cursojava.algaworks.dataapinova.month;

import java.time.LocalDate;
import java.time.Month;

public class CalculandoMeses {
    public static void main(String[] args) {
        Month mesAtual = LocalDate.now().getMonth();
        Month mesCalculado = mesAtual.plus(10);

        System.out.println(mesAtual);
        System.out.println(mesCalculado);
    }
}