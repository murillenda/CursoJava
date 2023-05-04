package cursojava.algaworks.lambda.interfacesfuncionais.consumer.algunsexemplos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leita", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

        produtos.forEach(produto -> System.out.println(produto));

        Consumer<Produto> consumerZerarEstoque = produto -> produto.setQuantidade(0);
        Consumer<Produto> consumerImprimir = produto -> System.out.println(produto);

        // Método default da interface Consumer para "faça isso e depois faça isso"
        produtos.forEach(consumerZerarEstoque.andThen(consumerImprimir));

//        for (Produto produto : produtos) {
//            System.out.println(produto);
//        }
    }
}
