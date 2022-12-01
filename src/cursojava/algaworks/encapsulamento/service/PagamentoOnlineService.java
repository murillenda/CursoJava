package cursojava.algaworks.encapsulamento.service;

import cursojava.algaworks.encapsulamento.Cartao;
import cursojava.algaworks.encapsulamento.Estabelecimento;
import cursojava.algaworks.encapsulamento.Recibo;

public class PagamentoOnlineService {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {


        cartao.debitar(valor);

        //TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento
        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }

}
