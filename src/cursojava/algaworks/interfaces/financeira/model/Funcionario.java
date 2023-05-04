package cursojava.algaworks.interfaces.financeira.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario implements PessoaBonificavel {

    private static final int QUANTIDADE_SALARIOS_LIMITE_CREDITO = 5;

    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIOS_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancada) {
        return getSalarioMensal() * percentualMetaAlcancada / 100;
    }
}
