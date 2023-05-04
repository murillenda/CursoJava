package cursojava.algaworks.lambda.interfacesfuncionais.as4principais;

import java.util.function.Consumer;

public class ConsumerFunctional {
    public static void main(String[] args) {
        // Representa uma operação que recebe um argumento do tipo T e não retorna nada, é void
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Olá, mergulhador");
    }
}
