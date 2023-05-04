package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.Optional;

public class BPrincipalFilter {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Optional<Produto> produtoOptional = produtos.stream()
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .findAny();

        Produto produto = produtoOptional.orElseThrow(
            () -> new RuntimeException("Produto não encontrado")
        );

        System.out.println(produto);
    }
}
