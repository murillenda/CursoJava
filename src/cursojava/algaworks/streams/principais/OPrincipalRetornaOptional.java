package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class OPrincipalRetornaOptional {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        //List<Produto> produtos = cadastroProduto.obterTodos();
        List<Produto> produtos = new ArrayList<>();

        // Aqui o reduce não recebe o identity

        OptionalInt maiorQuantidadeOptional = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(Integer::max);

        int maiorQuantidade = maiorQuantidadeOptional
            .orElseThrow(() -> new RuntimeException("Quantidade não encontrada"));

        System.out.println(maiorQuantidade);
    }
}
