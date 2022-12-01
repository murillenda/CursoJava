package cursojava.java8.lambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MethodReference {
    private static final BigDecimal BIG_DECIMAL_NUMERO_2 = BigDecimal.valueOf(2);
    public static void main(String[] args) {

        IntStream.range(0, 5)
                .forEach(System.out::println); //method reference

        IntStream.range(0, 5)
                .forEach(n -> System.out.println(n)); //sem method reference

        //Métodos estáticos

        IntStream.range(0, 5)
                .map(MethodReference::multipliquePorDois) //Chamo a classe :: nome do método
                .forEach(System.out::println);

        //Construtores

        IntStream.range(0, 5)
                .mapToObj(BigDecimal::new) //Chamo a classe :: nome do método
                .forEach(System.out::println);

        //várias instâncias

        var list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream()
                .map(Integer::doubleValue) //Chamo a classe :: nome do método
                .forEach(System.out::println);

        //única instância
        list.stream()
                .map(BigDecimal::new)
                .map(BIG_DECIMAL_NUMERO_2::multiply)
                .forEach(System.out::println);
    }

    private static Integer multipliquePorDois(Integer i) {
        return i * 2;
    }
}
