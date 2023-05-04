package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Fabricante;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VPrincipalGroupingBy {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Usamos groupingBy para agrupar os resultados
        // GroupingBy recebe um classifier como argumento

        Map<Fabricante, List<Produto>> produtosPorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.groupingBy(Produto::getFabricante));

        produtosPorFabricante.forEach((fabricante, produtosDoFabricante) -> {
            System.out.println();
            System.out.println(fabricante.nome());
            System.out.println("----------------");
            produtosDoFabricante.forEach(produto -> System.out.println(produto.getNome()));
        });
    }
}
