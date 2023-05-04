package cursojava.algaworks.polimorfismo.banco;

import cursojava.algaworks.heranca.banco.Titular;

public class ContaSalario extends Conta {

    private double salarioMensal;

    public ContaSalario(Titular titular, int agencia, int numero, double salarioMensal) {
        super(titular, agencia, numero);
        this.salarioMensal = salarioMensal;
    }
}
