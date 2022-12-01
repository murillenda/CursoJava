package cursojava.algaworks.encapsulamento;

import cursojava.algaworks.encapsulamento.service.DepositoPIXService;
import cursojava.algaworks.encapsulamento.service.PagamentoOnlineService;

public class Principal {
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado dó Zé");
        var cartao = new Cartao("João Souza Silva");

        var servicoDeDeposito = new DepositoPIXService();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new PagamentoOnlineService();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.getTitular());
        System.out.printf("Saldo: R$%.2f%n", cartao.getSaldo());
    }
}
