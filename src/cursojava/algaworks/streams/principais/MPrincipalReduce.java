package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class MPrincipalReduce {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Recebe dois elementos, (int) identity = Elemento considerado como valor inicial
        // Por exemplo, se quiserms fazer uma somatória, ela começa em qual valor? o 0
        // E depois recebe um IntBinaryOperator, que é um acumulador.
        // o acumulador é uma função que executa a operação de acumulo
        // do resultado parcial com o próximo elemento do stream
        // A função colocada no segundo parametro é chamdas várias vezes, para cada elemento

        // Interface funcional que recebe dois inteiros e retorna outro inteiro.
        System.out.println("Passo a passo do reduce para entendimento:");
        IntBinaryOperator operacaoSoma = (subtotal, valor) -> {
            System.out.println(subtotal + " + " + valor);
            return subtotal + valor;
        };

        int totalEstoque = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, operacaoSoma);

        System.out.println(totalEstoque);


        // Modo simplificado parcial:
        int totalEstoqueSimplificadoParcial = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, (x, y) -> x + y);

        System.out.println(totalEstoqueSimplificadoParcial);

        // Metodo mais simplificado possível:
        int totalEstoqueSimplificadoFull = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, Integer::sum);

        System.out.println(totalEstoqueSimplificadoFull);
    }
}
