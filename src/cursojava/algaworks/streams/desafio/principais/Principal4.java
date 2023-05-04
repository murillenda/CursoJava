package cursojava.algaworks.streams.desafio.principais;

import cursojava.algaworks.streams.desafio.ServicoDeVenda;
import cursojava.algaworks.streams.desafio.Venda;

import java.math.BigDecimal;
import java.util.List;

public class Principal4 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        BigDecimal totalVendas = vendas.stream()
            .filter(Venda::isFechada)
            .map(Venda::getValorTotal)
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalVendas);

        /*
        BigDecimal totalVendas = BigDecimal.ZERO;
        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                totalVendas = totalVendas.add(venda.getValorTotal());
            }
        }

        System.out.println(totalVendas);
         */
    }
}
