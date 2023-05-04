package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;

public class FPrincipalAnyMatchAllMatchNoneMatch {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // AnyMatch
        boolean temProdutoNoEstoque = produtos.stream()
            .anyMatch(Produto::temEstoque); // Retorna true caso alguém da lista tenha estoque

        System.out.println(temProdutoNoEstoque);

        //AllMatch
        boolean todosProdutosPossuemEstoque = produtos.stream()
            .allMatch(Produto::temEstoque); // Retorna true caso todos os produtos tenham estoque

        System.out.println(todosProdutosPossuemEstoque);

        //NoneMatch
        boolean nenhumProdutoPossuiEstoque = produtos.stream()
            .noneMatch(Produto::temEstoque); // Retorna true caso nenhum produto possua estoque

        System.out.println(nenhumProdutoPossuiEstoque);
    }
}
