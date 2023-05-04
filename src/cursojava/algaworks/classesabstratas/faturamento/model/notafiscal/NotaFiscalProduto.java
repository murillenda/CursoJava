package cursojava.algaworks.classesabstratas.faturamento.model.notafiscal;

import lombok.Getter;

@Getter
public class NotaFiscalProduto extends NotaFiscal {

    private static final double ALIQUOTA_IMPOSTOS_FEDERAIS = 0.18;
    private static final double ALIQUOTA_IMPOSTOS_ESTADUAIS = 0.12;

    private double valorFrete;

    public NotaFiscalProduto(String descricao, double valorTotal, double valorFrete) {
        super(descricao, valorTotal);
        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS_FEDERAIS;
        valorImpostos += getValorTotal() * ALIQUOTA_IMPOSTOS_ESTADUAIS;

        return valorImpostos;
    }
}
