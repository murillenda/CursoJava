package cursojava.java8.stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsParaQualquerCoisa {
    public static void main(String[] args) throws IOException {
        //Collection
        var list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(System.out::println);

        //Arrays
        Integer[] intArray = new Integer[] {1, 2, 3, 4};
        Arrays.stream(intArray).forEach(System.out::println);

        //Stream.of
        Stream.of("Se", "Inscreva", "No", "Canal", "!")
                .forEach(System.out::println);

        //IntStream.range
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);

        //Stream.iterate
        Stream.iterate(5, n -> n * 2)
                .limit(10)
                .forEach(System.out::println);

        //BufferedReader - lines
        //streams.txt - 11, 12, 13
        File file = new File("streams.txt");
        FileReader in = new FileReader(file);
        BufferedReader br = new BufferedReader(in);
        br.lines().forEach(System.out::println);

        //Files
        Path p = Paths.get("");
        Files.list(p).forEach(System.out::println);

        //Random
        new Random().ints()
                .limit(10)
                .forEach(System.out::println);

        //Pattern (trabalhar com regex)
        String s = "Deixe um like";
        Pattern pp = Pattern.compile(" ");
        pp.splitAsStream(s).forEach(System.out::println);
    }
}
