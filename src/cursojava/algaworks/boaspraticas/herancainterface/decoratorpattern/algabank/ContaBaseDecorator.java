package cursojava.algaworks.boaspraticas.herancainterface.decoratorpattern.algabank;

import cursojava.algaworks.boaspraticas.herancainterface.decoratorpattern.javabank.Conta;
import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class ContaBaseDecorator implements Conta {

    private Conta contaOriginal;

    protected ContaBaseDecorator(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }
}
