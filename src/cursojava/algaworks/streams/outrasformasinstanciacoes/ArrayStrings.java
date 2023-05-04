package cursojava.algaworks.streams.outrasformasinstanciacoes;

import java.util.Arrays;

public class ArrayStrings {
    public static void main(String[] args) {
        String[] nomes = {"Maria", "Sebastião", "João"};
        Arrays.stream(nomes)
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}
