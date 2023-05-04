package cursojava.algaworks.interfaces.comecointerfaces.contaspagar.model;

import cursojava.algaworks.interfaces.comecointerfaces.pagamento.Beneficiario;
import cursojava.algaworks.interfaces.comecointerfaces.pagamento.DocumentoPagavel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Holerite implements DocumentoPagavel {

    private Beneficiario funcionario;
    private double valorHora;
    private int quantidadeHoras;

    public Holerite(Beneficiario funcionario, double valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadeHoras();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFuncionario();
    }
}
