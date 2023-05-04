package cursojava.algaworks.dataapinova.periodos.period;

import java.time.Period;

public class Principal {
    public static void main(String[] args) {
        Period periodo = Period.ofDays(45);
        Period periodoMeses = Period.ofMonths(1);
        Period periodoAnos = Period.ofYears(1);
        Period periodoDefinido = Period.of(1, 5, 10);
        Period periodoRecebendoString = Period.parse("P2Y5M10D");

        System.out.println(periodo);
        System.out.println(periodoMeses);
        System.out.println(periodoAnos);
        System.out.println(periodoDefinido);
        System.out.println(periodoRecebendoString);

        // periodo + 10 anos
        // Period periodoCalculado = periodoRecebendoString.plus(Period.ofYears(10));
        Period periodoCalculado = periodoRecebendoString.plusYears(10);
        System.out.println(periodoCalculado);

        Period periodoMultiplicado = periodoRecebendoString.multipliedBy(3);
        // normalized deixa um periodo com 15 meses por exemplo, com 1 ano e 3 meses.
        System.out.println(periodoMultiplicado.normalized());

        String periodoFormatado = String.format("%d anos, %d meses e %d dias",
            periodoMultiplicado.getYears(), periodoMultiplicado.getMonths(), periodoMultiplicado.getDays());

        System.out.println(periodoFormatado);
    }
}
