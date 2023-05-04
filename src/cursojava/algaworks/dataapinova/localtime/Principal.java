package cursojava.algaworks.dataapinova.localtime;

import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
        LocalTime horario = LocalTime.now(); // Hora atual
        LocalTime horaInstanciada = LocalTime.of(22, 55, 10);

        System.out.println(horaInstanciada);
        System.out.println(horario);
    }
}
