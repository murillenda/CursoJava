package cursojava.algaworks.exceptions;

import cursojava.algaworks.exceptions.estoque.Produto;

public class Principal {
    public static void main(String[] args) {
        var produto = new Produto("Apple watch");
        produto.adicionarEstoque(10);

        produto.retirarEstoque(15);

        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());
    }
}
