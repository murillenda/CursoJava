package cursojava.algaworks.interfaces.desafio.model;

import lombok.Getter;

@Getter
public class ImovelResidencial implements BemSeguravel {

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.001) + (0.30 * getAreaConstruida());
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %sm2 de área construída, avaliado em R$%.2f%n",
            areaConstruida, valorMercado);
    }
}
