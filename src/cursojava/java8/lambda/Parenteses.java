package cursojava.java8.lambda;

import java.util.stream.IntStream;

public class Parenteses {
    public static void main(String[] args) {
        IntStream.range(0, 5)
                .filter((n) -> n % 2 == 0)  //Quando o parenteses é necessário () no local do n?
                .forEach(System.out::println);

        //Declaração de tipo
        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0)  //'N' com parenteses e int atrás para definir o seu tipo
                .forEach(System.out::println);

        //Dois argumentos
        IntStream.range(0, 5)
                .filter(n -> n % 2 == 0)  //'N' com parenteses e int atrás para definir o seu tipo
                .reduce((n1, n2) -> n1 + n2) //Quando temos dois argumentos
                .ifPresent(System.out::println);

        //Dois argumentos com declaração de tipo
        IntStream.range(0, 5)
                .filter(n -> n % 2 == 0)  //'N' com parenteses e int atrás para definir o seu tipo
                .reduce((int n1, int n2) -> n1 + n2) //Quando temos dois argumentos e queremos colocar um tipo, temos que colocar em todos args
                .ifPresent(System.out::println);

        //Quando não tenho nada no argumento também é obrigatório
        Runnable runnable = () -> System.out.println("Se inscreva no canal! ");
    }
}
