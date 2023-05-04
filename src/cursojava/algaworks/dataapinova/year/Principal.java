package cursojava.algaworks.dataapinova.year;

import java.time.LocalDate;
import java.time.Year;

public class Principal {
    public static void main(String[] args) {
        Year ano = Year.now();
        Year anoInstanciadoPorDataEspecifica = Year.of(2023);
        Year anoInstanciadoPorLocalDate = Year.from(LocalDate.now());
        Year anoParseText = Year.parse("2023");

        System.out.println(ano);
        System.out.println(anoInstanciadoPorDataEspecifica);
        System.out.println(anoInstanciadoPorLocalDate);
        System.out.println(anoParseText);

        System.out.printf("Verificar se ano é bissexto: %b%n", anoParseText.isLeap()); // Ano Bissexto

        // Verificar dia do dia do programador
        LocalDate diaDoProgramador = ano.atDay(256);
        System.out.println(diaDoProgramador);
    }
}
