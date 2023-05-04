package cursojava.algaworks.dataapinova.adicionandoesubstraindometodosconveniencia;

import java.time.LocalDate;

public class MinusLocalDate {
    public static void main(String[] args) {
        // Se quiser somar, utilizar o plus
        LocalDate hoje = LocalDate.now();
        LocalDate semanaPassada = hoje.minusWeeks(1);

        System.out.println(hoje);
        System.out.println(semanaPassada);
    }
}
