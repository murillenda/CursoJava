package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.Comparator;
import java.util.List;

public class GPrincipalSorted {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // O sorted() ordena os produtos pela ordem natural, ou seja, precisa de um implements comparable na classe.
        // Mas caso você não tenha implementado essa interface ou ate tenha implementado
        // mas quer uma comparação com outro critério, então utilizamos a sobrecarga do sorted passando um comparator
        produtos.stream()
            .filter(Produto::temEstoque)
            .sorted(Comparator.comparingInt(Produto::getQuantidade))// ordena em relação ao campo quantidade.
            .forEach(produto -> System.out.printf("%s = %d unidades%n",
                produto.getNome(), produto.getQuantidade()));
        // Isso não altera a ordem da lista de produtos, altera a ordem APENAS do stream
    }
}
