package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Categoria;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SPrincipalUsandoCollectorsDefault {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Um Collector é uma representação dos 3 argumentos do collect (Supplier, accumulator e combiner)
        List<Categoria> categoriasComCollector = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            //.collect(Collectors.toSet())
            .collect(Collectors.toList()); // Recomenda-se utilizar a importação estática desse tipos de método.

        // Assim podemos simplificar muito nosso código
        System.out.println(categoriasComCollector);

        // Porém quando chamamos o collect assim, não existe a garantia de qual tipo de lista vai vir
        // pode até ser uma lista imutavel
        // Então podemos usar assim para garantir:
        List<Categoria> categoriasCollectorCollection = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(categoriasCollectorCollection);
    }
}
