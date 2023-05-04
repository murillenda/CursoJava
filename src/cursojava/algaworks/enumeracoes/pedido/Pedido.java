package cursojava.algaworks.enumeracoes.pedido;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {

    private String nomeCliente;
    @Setter(AccessLevel.NONE)
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;
    private int valorTotal;

    public void entregar() {
        status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
    }

    public void cancelar() {
        if (getStatus().podeSerCancelado(getValorTotal())) {
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("Pedido não pode ser cancelado");
        }
    }
}
