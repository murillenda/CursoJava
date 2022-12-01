package cursojava.java8.stream.paralelos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Comparacao {
    public static void main(String[] args) {
        //Métodos parallels = mais performance
        //Para usar a ordem não pode importar!@!!!@!!!
        //Diferença de Parallel e ParallelStream

        var list = Arrays.asList(1, 2, 3, 4, 5);

        //ParallelStream só pode ser chamado quando está na lista
        list.parallelStream().forEach(System.out::println);
        //Quando não está na lista, é necessário utilizar o .parallel para transforma-lo em parallelStream
        IntStream.rangeClosed(1, 5).parallel().forEach(System.out::println);
        System.out.println("-----------");
        //Quando utilizamos Streams Parallel's??
        // <- Existe um custo para utilizar streams Parallel's ->
        //Utilizamos o parallel quando precisamos ganhar performance no serviço, ou seja, milhares/milhões de registros sendo
        //processados
        //Em coisas pequenas podemos até mesmo perder performance

        //Streams parallels sempre vão mandar de formas aleatórias
        //ForEach x ForEachOrdered
        list.parallelStream().forEach(System.out::println); // Imprime de forma aleatória os números
        list.parallelStream().forEachOrdered(System.out::println); //Imprime de forma normal

        System.out.println("-----------");
        //findAny
        list.parallelStream()
                .findAny() // A primeira thread que achar o número vai ser lançada
                .ifPresent(System.out::println);
        list.stream()
                .findAny() // 1, apenas uma thread tradando a stream
                .ifPresent(System.out::println);

        System.out.println("-----------");

        //unordered
        list.parallelStream()
                .unordered() // Utilizar unordered para usar skip e limit nos parallelStreams para ganhar performance
                .skip(1)//unordered permite vc pular qualquer elemento
                .limit(2)// e limitar a qualquer 2 elementos
                .forEach(System.out::println); //Retorna 2, 3 ou 3, 2

        System.out.println("-----------");
        //reduce
        list.parallelStream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        System.out.println("-----------");
        //collect
        var collect = list.parallelStream()
                .collect(Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0)); // Permite mais threads ao mesmo tempo
        System.out.println(collect);
        System.out.println("-----------");
        //groupingby
        var group = list.parallelStream()
                .collect(Collectors.groupingByConcurrent(n -> n % 2 == 0)); // Permite mais threads ao mesmo tempo
        System.out.println(group);
    }
}
