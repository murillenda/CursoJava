package cursojava.algaworks.streams.outrasformasinstanciacoes;

import java.util.Random;
import java.util.stream.Stream;

public class GGenerateAndLimit {
    public static void main(String[] args) {
        Random random = new Random();

        // Stream generate gera uma stream infinita através de um Supplier
        Stream.generate(() -> random.nextInt(9) + 1) // O + 1 é para iniciar no 1 e não no 0, gera de 1 a 10 infinitamente
            .forEach(System.out::println);

        // Caso a gente queira parar ele em algum momento usamos o limit, o tamanho máximo do stream
        Stream.generate(() -> random.nextInt(9) + 1)
            .limit(6) // Limita em 6 elementos gerados
            .forEach(System.out::println);
    }
}
