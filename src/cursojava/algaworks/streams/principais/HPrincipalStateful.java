package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.Comparator;
import java.util.List;

public class HPrincipalStateful {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Mesmo o anymatch sendo curto-circuito, aqui o peek mostra que passamos por todos os produtos
        // pois o sorted é uma operação stateful, que mantém algum estado enuanto processa os elementos
        // E isso pode afetar o processamento.
        // Nesse caso por exemplo, é para saber qual elemento vem na frente de qual
        produtos.stream()
            .peek(System.out::println)
            .filter(Produto::temEstoque)
            .sorted(Comparator.comparingInt(Produto::getQuantidade))
            .anyMatch(Produto::temEstoque);
    }
}
