package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LPrincipalEspecializacoesTiposPrimitivos {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


        // Assim faz boxing, pois getQuantidade é um int, e aqui estamos
        // retornando um Integer
        Stream<Integer> stream = produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getQuantidade);

        // Faz unboxing
        stream.forEach(num -> System.out.println(num * 2));
        // Isso a cima pode ser um problema caso a massa de dados seja muito grande
        // assim afetando a performance

        //Tipoespecial de Stream para trabalhar com tipos primitivos:
        IntStream streamIntPrimitivo = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(Produto::getQuantidade); // recebe uma Função e retorna um IntStream
        // ToIntFunction é igual a Function, mas recebe como argumento um tipo qualquer
        // e retorna um tipo int primitivo

        // Aqui também começa a trabalhar com IntConsumer quando utilizamos o IntStream por exemplo
        streamIntPrimitivo.forEach(num -> System.out.println(num * 2));
        // Aqui trabalhamos de forma nativa apenas com o int e não tem mais boxing e unboxing
        // Torna o código mais performático.
    }
}
