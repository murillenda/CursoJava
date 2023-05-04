package cursojava.algaworks.lambda.methodreference;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Principal {
    public static void main(String[] args) {
        ToIntFunction<Produto> function1 = produto -> produto.getQuantidade();
        Consumer<Produto> consumer1 = produto -> produto.inativar();

        ToIntFunction<Produto> functionMethodReference = Produto::getQuantidade;
        Consumer<Produto> consumerMethodReference = Produto::inativar;
    }
}
