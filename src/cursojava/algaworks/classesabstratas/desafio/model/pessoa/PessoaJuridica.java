package cursojava.algaworks.classesabstratas.desafio.model.pessoa;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PessoaJuridica extends Pessoa{

    @Setter(AccessLevel.PRIVATE)
    private double faturamentoAnual;

    @Setter(AccessLevel.PRIVATE)
    private double despesaAnual;

    protected PessoaJuridica(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome);
        setFaturamentoAnual(faturamentoAnual);
        setDespesaAnual(despesaAnual);
    }

    public double getLucroAnual() {
        return getFaturamentoAnual() - getDespesaAnual();
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
            "nome='" + getNome() + '\'' +
            "faturamentoAnual=" + getFaturamentoAnual() +
            "despesaAnual=" + getDespesaAnual() +
            '}';
    }
}
