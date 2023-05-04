package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Fabricante;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.stream.Stream;

public class IPrincipalMap {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Stream<Fabricante> stream = produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante); // Retorna um stream de Fabricante.

        stream.forEach(System.out::println);

        //Forma mais enxuta:
        produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante)
            .forEach(System.out::println);
    }
}
