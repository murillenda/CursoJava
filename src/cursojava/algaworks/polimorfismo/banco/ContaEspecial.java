package cursojava.algaworks.polimorfismo.banco;

import cursojava.algaworks.heranca.banco.Titular;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponivel());
    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
            "titular=" + getTitular() +
            ", agencia=" + getAgencia() +
            ", numero=" + getNumero() +
            ", saldo=" + getSaldo() +
            ", valorTotalRendimentos=" + getValorTotalRendimentos() +
            ", tarifaMensal=" + tarifaMensal +
            ", limiteChequeEspecial=" + limiteChequeEspecial +
            '}';
    }
}
