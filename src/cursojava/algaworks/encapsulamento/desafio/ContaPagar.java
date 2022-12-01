package cursojava.algaworks.encapsulamento.desafio;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ContaPagar implements Serializable {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public boolean isPendente() {
        return !isPago();
    }

    public void pagar() {
        if (isPago()) {
            throw new RuntimeException("Conta já está paga");
        }
        this.pago = true;
    }

    public void cancelarPagamento() {
        if (isPendente()) {
            throw new RuntimeException("Já está pendente de pagamento");
        }
        this.pago = false;
    }
}
