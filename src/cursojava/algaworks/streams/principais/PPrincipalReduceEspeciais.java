package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;

public class PPrincipalReduceEspeciais {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Operação terminal que faz a soma
        int totalEstoques = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .sum(); // Método que vem da interface de IntStream

        System.out.println(totalEstoques);

        // Operação terminal que faz a média
        double mediaEstoque = produtos.stream()
            .mapToDouble(Produto::getQuantidade)
            .average()
            .orElseThrow(() -> new RuntimeException("Não há produtos para calcular a média"));

        System.out.println(mediaEstoque);

        // Operação terminal que faz a contagem
        long totalProdutosComEstoque = produtos.stream()
            .filter(Produto::temEstoque)
            .count();

        System.out.println(totalProdutosComEstoque);
    }
}
