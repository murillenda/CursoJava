package cursojava.algaworks.polimorfismo.banco;

import cursojava.algaworks.heranca.banco.Titular;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Conta {

    @Setter(AccessLevel.NONE)
    private Titular titular;

    @Setter(AccessLevel.NONE)
    private int agencia;

    @Setter(AccessLevel.NONE)
    private int numero;

    @Setter(AccessLevel.NONE)
    private double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public final void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }
        saldo += valorDeposito;
    }

    public boolean possuiGratuidadeImpressao() {
        return false;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
            "titular=" + (titular != null ? titular.getNome() : null) +
            ", agencia=" + agencia +
            ", numero=" + numero +
            ", saldo=" + saldo +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return getAgencia() == conta.getAgencia() && getNumero() == conta.getNumero();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAgencia(), getNumero());
    }
}
