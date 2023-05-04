package cursojava.algaworks.enumeracoes.pedido;

import lombok.Getter;

@Getter
public enum StatusPedido {

    RASCUNHO {
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return true;
        }
    },
    EMITIDO(12){
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return valorPedido < 100;
        }
    },
    EM_ANALISE(11) {
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return valorPedido < 100;
        }
    },
    FATURADO(10) {
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return false;
        }
    },
    SEPARADO(8) {
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return false;
        }
    },
    DESPACHADO(6) {
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return false;
        }
    },
    ENTREGUE(0) {
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeSerCancelado(int valorPedido) {
            return false;
        }
    };

    private Integer tempoEntregaEmHoras;

    StatusPedido() {

    }

    StatusPedido(int tempoEntregaEmHoras) {
        this.tempoEntregaEmHoras = tempoEntregaEmHoras;
    }

    public abstract boolean podeSerCancelado(int valorPedido);


}
