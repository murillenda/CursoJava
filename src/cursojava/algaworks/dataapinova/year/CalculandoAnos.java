package cursojava.algaworks.dataapinova.year;

import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class CalculandoAnos {
    public static void main(String[] args) {
        Year ano = Year.parse("2023");
        // Year anoFuturo = ano.plus(Period.parse("P10Y10M")); // Não Funciona, pois tem meses
        Year anoFuturo = ano.plus(Period.parse("P10Y")); // Funciona, pois só tem anos
        Year anoFuturoChronoUnit = ano.plus(10, ChronoUnit.CENTURIES); // 10 séculos na frente (1000 anos)
        Year anoSomaSimples = ano.plusYears(10); // Método mais enxuto de somar anos

        System.out.println(ano);
        System.out.println(anoFuturo);
        System.out.println(anoFuturoChronoUnit);
        System.out.println(anoSomaSimples);
    }
}
