package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class QPrincipalReduceEspeciaisMinMax {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Dentro dos produtos que tem estoque, qual a menor quantidade
        int menorQuantidadeEstoque = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(Produto::getQuantidade)
            //.max
            .min()
            .orElseThrow(() -> new RuntimeException("Menor quantidade não encontrada"));
        System.out.println(menorQuantidadeEstoque);

        // Para saber por exemplo, o produto mais barato do estoque:
        Produto produtoMaisBarato = produtos.stream()
            .filter(Produto::temEstoque)
            .min(Comparator.comparing(Produto::getPreco)) // Precisamos passar o comparator.
            .orElseThrow(() -> new RuntimeException("Não foi possível encontrar o produto mais barato"));
        System.out.println(produtoMaisBarato);
    }
}
