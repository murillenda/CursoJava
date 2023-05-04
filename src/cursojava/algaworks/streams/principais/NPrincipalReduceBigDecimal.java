package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.math.BigDecimal;
import java.util.List;

public class NPrincipalReduceBigDecimal {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        BigDecimal valorEmEstoque = produtos.stream()
            .map(produto -> produto.getPreco()
                .multiply(new BigDecimal(produto.getQuantidade())))
            .reduce(BigDecimal.ZERO, BigDecimal::add); //soma os valores

        System.out.println(valorEmEstoque);

        // Para maior legibilidade é muito melhor passar o cálculo de valor em estoque para classe produto, assim:
        BigDecimal valorEmEstoqueMaisLegivel = produtos.stream()
            .map(Produto::valorTotalEstoque) // Aqui passamos a conta para um método na classe Produto, para maior legibilidade
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(valorEmEstoqueMaisLegivel);


        // Outra forma usando uma sobrecarga do reduce que recebe
        // 1° argumento: identity
        // 2° argumento: função que queremos acumular.
        // 3° argumento: função de combinação, um Combiner.
        // A função Combiner, basicamente vai ser para combinar todos os processos que foram realizados.

        BigDecimal valorEmEstoqueOutraForma = produtos.stream()
            .reduce(BigDecimal.ZERO, (subtotal, produto) -> {
                BigDecimal valorEstoqueProduto = produto.getPreco()
                    .multiply(new BigDecimal(produto.getQuantidade()));
               return subtotal.add(valorEstoqueProduto);
            }, BigDecimal::add);

        System.out.println(valorEmEstoqueOutraForma);
    }
}
