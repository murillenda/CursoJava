package cursojava.algaworks.encapsulamento.service;

import cursojava.algaworks.encapsulamento.Cartao;
import cursojava.algaworks.encapsulamento.Recibo;

import static cursojava.algaworks.encapsulamento.Cartao.*;

public class DepositoPIXService {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        //TODO faz cobrança do valor no PIX

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }

}
