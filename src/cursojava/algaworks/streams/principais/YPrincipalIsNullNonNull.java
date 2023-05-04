package cursojava.algaworks.streams.principais;

import java.util.Arrays;
import java.util.Objects;

public class YPrincipalIsNullNonNull {
    public static void main(String[] args) {
        String[] nome = {"João", null, "Maria", null};
        // Esses métodos foram utilizados para se utilizar com a stream API

        Arrays.stream(nome)
            .filter(Objects::nonNull)
            .forEach(System.out::println);

        Arrays.stream(nome)
            .filter(Objects::isNull)
            .forEach(System.out::println);

    }
}
