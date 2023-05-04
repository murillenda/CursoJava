package cursojava.algaworks.lambda.interfacesfuncionais.algumasvariancias;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Variancias {
    public static void main(String[] args) {
        // Caso vá fazer operações com tipos primitivos não é legal utilizar as padrões,
        // pois ocorre muito box e afeta a performance
        // mas sim os tipos variantes:
        IntPredicate predicate = num -> num > 10;
        IntFunction<String> function = num -> "Número: " + num;
        IntSupplier supplier = () -> 10;
        IntConsumer consumer = num -> System.out.println(num);
    }
}
