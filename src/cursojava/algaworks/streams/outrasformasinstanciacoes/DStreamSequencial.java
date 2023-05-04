package cursojava.algaworks.streams.outrasformasinstanciacoes;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DStreamSequencial {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
            .forEach(System.out::println);

        // com tipo primitivo
        int total = IntStream.of(1, 2, 3)
            .sum();
        System.out.println(total);
    }
}
