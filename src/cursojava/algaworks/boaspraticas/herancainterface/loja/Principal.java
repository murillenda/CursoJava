package cursojava.algaworks.boaspraticas.herancainterface.loja;

import cursojava.algaworks.boaspraticas.herancainterface.loja.pagamento.MetodoPagamento;
import cursojava.algaworks.boaspraticas.herancainterface.loja.pagamento.Transferencia;

public class Principal {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(new ItemCarrinho("Air Pods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic mouse", 600));

        MetodoPagamento metodoPagamento = new Transferencia("9999", "7");

        carrinho.finalizar(metodoPagamento);
    }
}
