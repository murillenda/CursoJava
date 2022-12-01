package cursojava.java8.lambda;

import java.util.stream.IntStream;

public class Chaves {
    public static void main(String[] args) {
        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0 ) //Quando vou usar chaves na expressão Lambda?
                .forEach(System.out::println);

        //em caso de return colocar as chaves e o ;
        IntStream.range(0, 5)
                .filter((int n) -> {return n % 2 == 0; })
                .forEach(System.out::println);

        //Para colocar mais expressões também é utilizado chaves
        IntStream.range(0, 5)
                .filter((int n) -> {
                    System.out.println("Se inscreva no canal");
                    return n % 2 == 0; })
                .forEach(System.out::println);
    }
}
