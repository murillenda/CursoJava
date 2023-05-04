package cursojava.algaworks.dataapinova.localdatetime;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now(); //Data hora de agora
        LocalDateTime dataHoraInstanciado = LocalDateTime.of(2000, 5, 28, 23, 55, 10);

        System.out.println(dataHoraInstanciado);
        System.out.println(dataHora);
    }
}
