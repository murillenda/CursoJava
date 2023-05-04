package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Categoria;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class TPrincipalCollectorUnmodifiableListJava10 {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .collect(Collectors.toUnmodifiableList());

        // categorias.remove(0); // Não funciona porque é uma lista que nao pode ser modificada
        System.out.println(categorias);

        // A partir do java 16:
        List<Categoria> categoriasJava16Exemplo = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .toList(); // Retorna uma lista não modificável

        System.out.println(categoriasJava16Exemplo);

    }
}
