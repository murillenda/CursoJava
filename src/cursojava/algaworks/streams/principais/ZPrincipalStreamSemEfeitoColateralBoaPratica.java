package cursojava.algaworks.streams.principais;

import cursojava.algaworks.streams.introducao.CadastroProduto;
import cursojava.algaworks.streams.introducao.Fabricante;
import cursojava.algaworks.streams.introducao.Produto;

import java.util.ArrayList;
import java.util.List;

public class ZPrincipalStreamSemEfeitoColateralBoaPratica {
    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Fabricante> fabricantes = new ArrayList<>();

        // Não é um código legal, ta usando uma variável externa e alterando seu estado
        // Sempre que isso acontecer, tem que acender um sinal de alerta pra ver se tem jeito melhor de resolver
        // O foreach deve ser somente utilizado para apresentar o resultado das operaçõs da pipeline do Stream
        // Não deve executar operações operando as coisa.
        produtos.stream()
            .filter(Produto::temEstoque)
            .forEach(produto -> {
                if (!fabricantes.contains(produto.getFabricante())) {
                    fabricantes.add(produto.getFabricante());
                }
            });
        System.out.println(fabricantes);

        // O correto é ser uma função pura, que depende só da entrada da entrada na stream.

        // Modo correto de utilizar as streams, utilizando por completo os paradigmas de programação funcional
        List<Fabricante> fabricantesListaModoCorreto = produtos.stream()
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante)
            .distinct()
            .toList();

        System.out.println(fabricantesListaModoCorreto);
    }
}
