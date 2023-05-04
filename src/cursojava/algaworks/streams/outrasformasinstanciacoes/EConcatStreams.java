package cursojava.algaworks.streams.outrasformasinstanciacoes;

import java.util.stream.Stream;

public class EConcatStreams {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(9, 8, 7);
        Stream.concat(stream1, stream2)
            .forEach(System.out::println);
    }
}
