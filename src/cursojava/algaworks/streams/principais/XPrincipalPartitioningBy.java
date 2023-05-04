package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class XPrincipalPartitioningBy {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // A chave do partitioningBy é sempre um booleano
        // e o valor é sempre uma lista de objetos do tipo do stream
        // É uma forma de particionar os elemtos do stream em dois grupos
        // Onde um lado vai ter os objetos verdadeiros e do outro lado os falsos
        Map<Boolean, List<Produto>> estoqueProdutos = produtos.stream()
            .collect(Collectors.partitioningBy(Produto::temEstoque));
        // Nesse exemplo, os produtos que tem estoque ficam no true e os que não possuem, ficam no false

        estoqueProdutos.forEach((chave, valor) -> {
            System.out.println();
            System.out.println(chave);
            System.out.println("------------");
            valor.forEach(System.out::println);
        });
    }
}
