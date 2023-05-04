package cursojava.algaworks.boaspraticas.herancainterface.locadora;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notebook {

    private String descricao;
    private double precoPorHora;
    private double precoPorDia;

    public Notebook(String descricao, double precoPorHora, double precoPorDia) {
        this.descricao = descricao;
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
    }


}
