package cursojava.algaworks.interfaces.financeira.model;

import lombok.Getter;

@Getter
public class ParceiroFinanceiro extends Empresa {

    private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public void adicionarNovaAplicacao(double valorAplicado) {
        valorTotalAplicado += valorAplicado;
    }
}
