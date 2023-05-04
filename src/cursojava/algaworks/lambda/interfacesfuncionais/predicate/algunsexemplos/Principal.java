package cursojava.algaworks.lambda.interfacesfuncionais.predicate.algunsexemplos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Sabão", new BigDecimal("9.9"), 11));
        produtos.add(new Produto("Leita", new BigDecimal("3.4"), 22));
        produtos.add(new Produto("Macarrão", new BigDecimal("9.3"), 0));
        produtos.add(new Produto("Cerveja", new BigDecimal("5.8"), 14));
        produtos.add(new Produto("Arroz", new BigDecimal("15.9"), 0));
        produtos.add(new Produto("Chocolate", new BigDecimal("25.1"), 10, Produto.Status.INATIVO));

        // produtos.removeIf(produto -> produto.getQuantidade() <= 0);

        // Utilizando mais de um predicate juntos
        Predicate<Produto> predicateSemEstoque = produto -> produto.getQuantidade() < 1;
        Predicate<Produto> predicateInativo = produto -> Produto.Status.INATIVO.equals(produto.getStatus());
        // Remove caso seja sem estoque ou inativo
        produtos.removeIf(predicateSemEstoque.or(predicateInativo));
        // Retorna o inverso do retorno, caso tenha estoque irá remover
        produtos.removeIf(predicateSemEstoque.negate());
        // Outra forma de negar, ele chama o negate para negar.
        produtos.removeIf(Predicate.not(predicateSemEstoque));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
