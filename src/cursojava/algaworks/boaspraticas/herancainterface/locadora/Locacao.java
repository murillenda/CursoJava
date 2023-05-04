package cursojava.algaworks.boaspraticas.herancainterface.locadora;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Locacao {

    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    protected Locacao(Notebook notebook, Precificacao precificacao) {
        Objects.requireNonNull(notebook);
        Objects.requireNonNull(precificacao);
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public boolean temSeguro() {
        return getSeguro() != null;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = getPrecificacao().calcularValorTotal(getNotebook(), horasUtilizadas);
        if (temSeguro()) {
            valorTotal += getSeguro().calcularPremio(horasUtilizadas, valorTotal);
        }

        return valorTotal;
    }

}
