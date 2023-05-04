package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.stream.Stream;

public class APrincipalIntroducao {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        // List é um Collection
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Na interface de collection temos um método chamado Stream
        // Conseguimos usar o stream para manipular os elementos da lista, diversas operações
        // inclusive iterações
        Stream<Produto> stream = produtos.stream();

        // Esse é um tipo de stream desnecessário
        stream.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });

        // Pois pode-se fazer assim tranquilamente e fica mais entendível
        for (Produto produto : produtos) {
            produto.ativar();
            System.out.println(produto);
        }
    }

}
