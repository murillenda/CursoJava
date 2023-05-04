package cursojava.algaworks.classesabstratas.desafio.model.pessoa;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisica extends Pessoa {

    private static final double RECEITA_ANUAL_ISENCAO = 50_000;
    private static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    @Setter(AccessLevel.PRIVATE)
    private double receitaAnual;


    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        setReceitaAnual(receitaAnual);
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = 0;
        if (isNotIsentoImposto()) {
            valorImpostos = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
        }
        return valorImpostos;
    }

    private boolean isIsentoImposto() {
        return getReceitaAnual() <= RECEITA_ANUAL_ISENCAO;
    }

    private boolean isNotIsentoImposto() {
        return !isIsentoImposto();
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
            "nome='" + getNome() + '\'' +
            "receitaAnual=" + receitaAnual +
            '}';
    }
}
