package cursojava.algaworks.boaspraticas.herancainterface.decoratorpattern.algabank;

import cursojava.algaworks.boaspraticas.herancainterface.decoratorpattern.javabank.Conta;
import lombok.Getter;

@Getter
public class PontuacaoDecorator extends ContaBaseDecorator {

    private int pontos;

    public PontuacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }

    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos += valor / 100;
    }
}
