package cursojava.algaworks.streams.outrasformasinstanciacoes;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class BMetodoIterate {
    public static void main(String[] args) {
        // Recebe um seed, um valor inicial
        // O segundo argumento é um UnaryOperator, recebe o valor do elemento anterior como parâmetro e depois fazer a conta
        Stream.iterate(new BigDecimal("1000"),
            valor -> valor.subtract(new BigDecimal("10"))) // Diminui 10 do valor sempre
            .forEach(System.out::println);

        // Porém assim fica infinito
        // Para não ficar infinito usamos essa sobrecarga que o 2° argumento a gente fala se parou ou se continua gerando mais elementos
        Stream.iterate(new BigDecimal("1000"),
            valor -> valor.compareTo(BigDecimal.ZERO) >= 0, //Enquanto o numero gerado for maior que zero, tem proximo
            valor -> valor.subtract(new BigDecimal("10")))
            .forEach(System.out::println);
    }
}
