package cursojava.algaworks.streams.desafio.principais;

import cursojava.algaworks.streams.desafio.ServicoDeVenda;
import cursojava.algaworks.streams.desafio.Venda;

import java.util.List;

public class Principal1 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        vendas.stream()
            .filter(Venda::isFechada)
            .forEach(System.out::println);
    }
}
