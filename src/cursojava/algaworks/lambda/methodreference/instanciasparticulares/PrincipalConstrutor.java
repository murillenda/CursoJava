package cursojava.algaworks.lambda.methodreference.instanciasparticulares;

import java.util.function.Function;

public class PrincipalConstrutor {
    public static void main(String[] args) {
        //<String, Produto> function = nome -> new Produto(nome);
        Function<String, Produto> function = Produto::new;
        Produto produto = function.apply("Murillo");
    }
}
