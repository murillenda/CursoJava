package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;

public class DPrincipalPeek {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
            .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .forEach(produto -> {
                System.out.println("Ativando Produto");
                produto.ativar();
            });

        // O uso mais comum desse método é para fazer debugging da execução da pipeline,
        // quando cada elemento do stream é processado.

        produtos.stream()
            .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
            .peek(System.out::println) // Mostra o produto antes de realizar as configs
            .filter(Produto::temEstoque)
            .filter(Produto::isInativo)
            .forEach(produto -> {
                System.out.println("Ativando Produto");
                produto.ativar();
            });
    }
}
