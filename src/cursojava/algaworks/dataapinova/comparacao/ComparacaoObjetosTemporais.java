package cursojava.algaworks.dataapinova.comparacao;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class ComparacaoObjetosTemporais {
    public static void main(String[] args) {
        LocalDate hoje1 = LocalDate.now();
        LocalDate hoje2 = LocalDate.now();

        // Instancia um calendário budista, caso formos comparar, é diferente
        ThaiBuddhistDate hojeThai = ThaiBuddhistDate.now();

        LocalDate depoisDeAmanha = hoje1.plusDays(2);

        System.out.println(hoje1.equals(hoje2));

        // Sempre dê preferencia para a comparação isEqual quando utilizamos data
        // Pois consegue comparar conteúdo de calendários diferentes na compatibilidade de datas.
        System.out.println(hoje1.isEqual(hojeThai));

        // Comparação com compareTo
        System.out.println(depoisDeAmanha.compareTo(hoje1) > 0);

        // Mesma coisa que o compareTo, porem com legibilidade maior
        System.out.println(depoisDeAmanha.isAfter(hoje1));
        System.out.println(depoisDeAmanha.isBefore(hoje1));
    }
}
