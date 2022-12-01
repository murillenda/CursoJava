package cursojava.java8.stream.collect;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class J8C1 {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6);

        var collect = list.stream()
                .collect(
                        () -> new HashSet<>(), // Instancia que eu quero usar pra armazenar os resultados
                        (l, e) -> l.add(e),  // Como eu armazeno o resultado dentro disso
                        (l1, l2) -> l1.addAll(l2) //Como combino as threads que podem estar tratando ao mesmo tempo esse stream
        );
        System.out.println(collect);

        //toList

        var collectToList = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("collectToList = " + collectToList);

        //toSet

        var collectToSet = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("collectToSet = " + collectToSet);

        //toCollection

        var collectionToCollection = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println("collectionToCollection = " + collectionToCollection);

        //joining

        var collectionJoining = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(";")); //Pode ou não passar um delimitador
        System.out.println("collectionJoining = " + collectionJoining);
    }
}
