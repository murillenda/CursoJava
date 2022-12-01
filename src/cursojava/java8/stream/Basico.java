package cursojava.java8.stream;

import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;

public class Basico {
    public static void main(String[] args) {
        //Streams = loops IMPLÍCITOS
        System.out.println("____________________________________________________");
//        List<Array> arrayListTest = new ArrayList<>();
        List<Integer> lista =  Arrays.asList(1, 3, 4, 4 , 2, 11, 12893, 11, 44, 5, 2, 4, 723, 1);

        //Operações Intermediárias com foreach e operação final
        lista.stream() //Lembrando que tudo da stream não modifica nada da lista original, ela continua normal, pode-se ver no print final
                .skip(2) // Pula os dois primeiros números da stream
                .limit(2) // Escreve os dois primeiros números após os dois primeiros pulados pelo skip e ignora o resto
                .map(e -> e * 3) // Transformação na lista
                .filter(e -> e % 2 == 0) // Filtra números pares
                .distinct() //usa o equals e hashcode para não deixar repetir informações
                .forEach(System.out::println); //printa varrendo a lista do que sobrou e é uma operação final

        //Operação final findAny
        var findAny = lista.stream()
                .filter(e -> e % 2 == 0)
                .findAny(); //Encontra o primeiro numero e vaza da stream

        //Operação final count
        long count = lista.stream()
                .filter(e -> e % 3 == 0)
                .count(); //Conta quantos valores tem na lista

        //Operação final min/max
        Optional<Integer> minValue = lista.stream()
                .min(Comparator.naturalOrder()); //valor Minimo, existe o max também

        //Operação final collect to List
        List<Integer> novaLista = lista.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 3)
                .collect(Collectors.toList()); //Coleta o valor na nova lista transformando os valores em uma lista

        //Operação final collect groupingBy
        var mapa = lista.stream()
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0)); //Coleta um Map agrupando pelo resultado, neste caso é um boolean pq é uma comparação no groupingBy

        //Operação final collect joining
        String collect = lista.stream()
                .map(Object::toString) // Transforma em String os valores da lista
                .collect(Collectors.joining(";")); // Só funciona com string e junta todos os valores(concatena)
                                                            // Coloquei um delimitador, mas não é necessário

        System.out.println("Count = " + count);
        System.out.println("MinValue = " + minValue);
        System.out.println("novaListaComCollect = " + novaLista);
        System.out.printf(" <- transformandoEmHashMapComCondição -> %n" + mapa + "%n");
        System.out.println("Valores do joining = " + collect);
        System.out.printf(" <- Lista original não é modificada pelo stream() -> %n" + lista);
    }
}
