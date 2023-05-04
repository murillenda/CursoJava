package cursojava.algaworks.boaspraticas.herancainterface.loja;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemCarrinho {

    private String descricao;
    private double valor;

    public ItemCarrinho(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
}
