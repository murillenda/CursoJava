package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UPrincipalCollectMap {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


        // Retorna um map
        // 1° argumento -> uma Function que implementamos falando como vai ser gerado a chave da entrada
        // 2° arumento -> valor da chave
        Map<String, Integer> estoque = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.toMap(
                produto -> produto.getNome(),
                produto -> produto.getQuantidade()));

        System.out.println(estoque);
    }
}
