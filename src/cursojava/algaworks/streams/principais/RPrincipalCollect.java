package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Categoria;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.ArrayList;
import java.util.List;

public class RPrincipalCollect {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // .collect() pode receber os argumentos:
        // 1° -> Supplier (() -> new ArrayList<>())
        // 2° -> accumulator, que é um BiConsumer, recebe dois argumentos e nao retorna nada
        // Onde o primeiro elemento é a lista e o segundo elemento é cada elemento da stream
        // 3° -> é um Combiner, um combinador, nesse exemplo adicionamos a lista 2 inteira na lista 1 para juntar tudo.
        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .collect(
                () -> new ArrayList<>(),
                (lista, elemento) -> lista.add(elemento),
                (lista1, lista2) -> lista1.addAll(lista2)
            );

        // Basicamente com .collect, transformamos uma stream de categorias em uma lista de categorias.
        System.out.println(categorias);

        // Com method reference:
        List<Categoria> categoriasMethodReference = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        // Basicamente com .collect, transformamos uma stream de categorias em uma lista de categorias.
        System.out.println(categoriasMethodReference);
    }
}
