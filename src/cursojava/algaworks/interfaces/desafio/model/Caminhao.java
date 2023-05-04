package cursojava.algaworks.interfaces.desafio.model;

import lombok.Getter;

@Getter
public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.02) + (50 * getQuantidadeEixos());
    }

    @Override
    public String descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado em R$%.2f%n",
            getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
    }
}
