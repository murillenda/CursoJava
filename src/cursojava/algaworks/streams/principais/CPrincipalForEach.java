package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.stream.Stream;

public class CPrincipalForEach {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Fase de operação intermediária
        // Fase de configuração de pipeline
        Stream<Produto> stream = produtos.stream();
        Stream<Produto> streamComEstoque = stream.filter(Produto::temEstoque);
        Stream<Produto> streamComEstoqueInativo = streamComEstoque.filter(Produto::isInativo);

        // Fase de operação terminal, executa a pipeline.
        streamComEstoqueInativo.forEach(produto -> {
            System.out.println("Ativando Produto" + produto);
            produto.ativar();
        });
    }
}
