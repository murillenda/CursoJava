package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;

public class KPrincipalFlatMap {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // flatMap combina todos os streams internos em um único stream com todos os elementos dos streams internos
        produtos.stream()
            .filter(Produto::temEstoque)
            // pra cada produto, mapeamos para o stream das categorias desse produto
            // para não ficar uma stream<stream> achatamos isso com o flatman basicamente.
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .forEach(System.out::println);
    }
}
