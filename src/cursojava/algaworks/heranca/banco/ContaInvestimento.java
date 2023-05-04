package cursojava.algaworks.heranca.banco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos = valorRendimentos;
        depositar(valorRendimentos);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
            "titular=" + getTitular() +
            ", agencia=" + getAgencia() +
            ", numero=" + getNumero() +
            ", saldo=" + getSaldo() +
            ", valorTotalRendimentos=" + valorTotalRendimentos +
            '}';
    }

}
