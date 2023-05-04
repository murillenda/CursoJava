package cursojava.algaworks.interfaces.comecointerfaces.contaspagar.model;

import cursojava.algaworks.interfaces.comecointerfaces.pagamento.Beneficiario;
import cursojava.algaworks.interfaces.comecointerfaces.pagamento.DocumentoPagavel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrdemServico implements DocumentoPagavel {

    private Beneficiario fornecedor;
    private double valorTotal;

    public OrdemServico(Beneficiario fornecedor, double valorTotal) {
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return fornecedor;
    }
}
