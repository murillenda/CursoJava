package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;

public class JPrincipalDistinct {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Distinct retorna um stream do mesmo tipo
        // Porém com apenas elementos únicos, elimina os elementos duplicados.
        // Mas para isso funcionar, precisa ter o método equals na classe Fabricante nesse caso
        // Como Fabricante é um record, ele já tem o equals implementado

        produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante)
            .distinct()
            .forEach(System.out::println);
    }
}
