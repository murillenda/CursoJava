package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.Optional;

public class EPrincipalFindFirstFindAny {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // FindFirst

        Optional<Produto> produtoOptional = produtos.stream()
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .findFirst();

        Produto produtoFirst = produtoOptional.orElseThrow(
            () -> new RuntimeException("Produto não encontrado")
        );

        System.out.println(produtoFirst);

        // FindAny
        Optional<Produto> produtoOptionalAny = produtos.stream()
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .findFirst();

        Produto produtoAny = produtoOptionalAny.orElseThrow(
            () -> new RuntimeException("Produto não encontrado")
        );

        System.out.println(produtoAny);
    }
}
