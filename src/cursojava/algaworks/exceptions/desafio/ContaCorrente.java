package cursojava.algaworks.exceptions.desafio;

import cursojava.algaworks.exceptions.desafio.customizadas.ContaInativaException;
import cursojava.algaworks.exceptions.desafio.customizadas.SaldoInsuficienteException;

import java.util.Objects;

public class ContaCorrente {

    private final String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public void sacar(double valor) {
        if (isValorNegativoOuZero(valor)) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        }

        if (naoPossuiSaldoSuficiente(valor)) {
            throw new SaldoInsuficienteException("Sem saldo o suficiente para sacar");
        }

        if (isInativa()) {
            throw new ContaInativaException("Não é permitido saque em conta inativa");
        }

        this.saldo -= valor;
    }

    private boolean naoPossuiSaldoSuficiente(double valor) {
        return valor > this.saldo;
    }

    private boolean isValorNegativoOuZero(double valor) {
        return valor <= 0;
    }

    public void depositar(double valor) {
        if (isValorNegativoOuZero(valor)) {
            throw new IllegalArgumentException("Valor de deposito deve ser maior que 0");
        }

        if (isInativa()) {
            throw new ContaInativaException("Não é permitido depositar em conta inativa");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino);

        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Não é permitido transferir para conta inativa");
        }

        sacar(valor);
        contaDestino.depositar(valor);
    }
}
