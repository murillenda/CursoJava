package cursojava.algaworks.interfaces.desafio.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class VeiculoAutomotor implements BemSeguravel {

    private String modelo;
    private double valorMercado;
    private int anoFabricacao;

    protected VeiculoAutomotor(String modelo, double valorMercado, int anoFabricacao) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }
}
