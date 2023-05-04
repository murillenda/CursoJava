package cursojava.algaworks.classesabstratas.faturamento.model.notafiscal;

public class NotaFiscalServico extends NotaFiscal{

    private static final int VALOR_MAXIMO_INSENCAO_FISCAL = 1000;
    private static final double ALIQUOTA_IMPOSTOS = 0.18;

    private boolean interMunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean interMunicipal) {
        super(descricao, valorTotal);
        this.interMunicipal = interMunicipal;
    }

    public boolean isInterMunicipal() {
        return interMunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;

        if (isIsentoImpostos()) {
            valorImpostos = 0;
        }

        return valorImpostos;
    }

    private boolean isIsentoImpostos() {
        return isInterMunicipal() && getValorTotal() <= VALOR_MAXIMO_INSENCAO_FISCAL;
    }
}
