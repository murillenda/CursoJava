package cursojava.java8.stream.collect;

import java.util.Arrays;
import java.util.stream.Collectors;

public class J8C2 {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Média dos valores inteiros no array (averaging)
        var media = list.stream()
                .collect(Collectors.averagingInt(n -> n.intValue()));
        System.out.println("media = " + media);

        //Soma dos valores inteiros no array (summing)
        var soma = list.stream()
                .collect(Collectors.summingInt(n -> n.intValue()));
        System.out.println("soma = " + soma);

        //summarizing (Possui avarage, count, max, min, sum) dentro dele
        var summarizing = list.stream()
                .collect(Collectors.summarizingInt(n -> n.intValue()));
        System.out.println("summarizing = " + summarizing);
    }
}
