package cursojava.algaworks.lambda.interfacesfuncionais.function.algunsexemplos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leita", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

        // Aqui a gente seta uma lógica para acontecer a comparação
        produtos.sort((produto1, produto2) -> Integer.compare(produto1.getQuantidade(), produto2.getQuantidade()));

        // Extrai o valor do campo que queremos
        Function<Produto, Integer> function1 = produto -> produto.getQuantidade();
        Function<Produto, String> function2 = produto -> produto.getNome();

        // Quem vai comparar um com o outro é a própria implementação do Comparator.comparing
        // thenComparing utilizamos para depois de comparar com a function1, compara na function2
        produtos.sort(Comparator.comparing(function1).thenComparing(function2));

        // Forma mais enxuta sem o thenComparing
        produtos.sort(Comparator.comparing(produto -> produto.getQuantidade()));

        // Usando ToIntFunction para tipos primitivos, utilizar caso o produto.getQuantidade for primitivo
        produtos.sort(Comparator.comparingInt(produto -> produto.getQuantidade()));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
