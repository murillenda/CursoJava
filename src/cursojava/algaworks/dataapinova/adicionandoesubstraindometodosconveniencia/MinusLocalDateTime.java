package cursojava.algaworks.dataapinova.adicionandoesubstraindometodosconveniencia;

import java.time.LocalDateTime;

public class MinusLocalDateTime {
    public static void main(String[] args) {
        // Se quiser somar, utilizar o plus
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime semanaPassadaMenosUmaHora = agora
            .minusWeeks(1)
            .minusHours(1);

        System.out.println(semanaPassadaMenosUmaHora);
    }
}
