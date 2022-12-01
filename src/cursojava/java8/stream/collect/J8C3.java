package cursojava.java8.stream.collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class J8C3 {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Count
        var count = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(count);

        //Max/min
        list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);
    }
}
