package cursojava.algaworks.dataapinova.adicionandoesubstraindometodosconveniencia;

import java.time.LocalTime;

public class MinusLocalTime {
    public static void main(String[] args) {
        // Se quiser somar, utilizar o plus
        LocalTime horaAtual = LocalTime.now();
        LocalTime umaHoraAtras = horaAtual.minusHours(1);

        System.out.println(horaAtual);
        System.out.println(umaHoraAtras);
    }
}
