package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WPrincipalValoresAgregadosGroupingBy {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Primeiro argumento -> Function que gera a chave do mapa.
        // Segundo argumento -> Passamos um DownStream para o valor.

        // Aqui mostra quantos fabricantes cadastrados e com estoque existem
        Map<String, Long> produtosPorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                Collectors.counting())); // Produz um long

        System.out.println(produtosPorFabricante);

        // Mostra quantos itens no estoque temos para cada Fabricante no total.
        Map<String, Integer> estoquePorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                Collectors.summingInt(Produto::getQuantidade)));

        System.out.println(estoquePorFabricante);
    }
}
