package cursojava.java8.stream.collect;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class J8C4 {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Grouping by (mapa)
        var groupBy = list.stream()
                .collect(Collectors.groupingBy(
                        (n) -> n % 3)
                );
        System.out.println("groupBy = " + groupBy);

        //Partitioningby (mapa de boolean), deve sempre retornar uma comparação
        var partitioningBy = list.stream()
                .collect(Collectors.partitioningBy(
                        (n) -> n % 3 == 0)
                );
        System.out.println("partitioningBy = " + partitioningBy);

        //toMap (mapa de boolean), deve sempre retornar uma comparação
        var toMap = list.stream()
                .collect(Collectors.toMap(
                        (n -> n),
                        n -> Math.pow(n.doubleValue(), 5))); //mapa dos numeros elevados a 5
        System.out.println("toMap = " + toMap);
    }
}
