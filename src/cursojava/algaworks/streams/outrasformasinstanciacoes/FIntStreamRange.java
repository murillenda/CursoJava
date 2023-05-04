package cursojava.algaworks.streams.outrasformasinstanciacoes;

import java.util.stream.IntStream;

public class FIntStreamRange {
    public static void main(String[] args) {
        // Gera elemetos de 1 a 9
        IntStream.range(1, 10)
            .forEach(System.out::println);

        // Gera elementos de 1 a 10
        IntStream.rangeClosed(1, 10)
            .forEach(System.out::println);
    }
}
