package cursojava.algaworks.enumeracoes.desafio;

import lombok.Getter;

@Getter
public enum StatusNotaFiscalEnum {

    NAO_EMITIDA("Não emitida") {
        @Override
        public boolean podeSerCancelada(double valor) {
            return true;
        }

        @Override
        public boolean podeSerEmitida() {
            return true;
        }
    },
    EMITIDA("Emitida") {
        @Override
        public boolean podeSerCancelada(double valor) {
            return valor < 1_000;
        }

        @Override
        public boolean podeSerEmitida() {
            return false;
        }
    },
    CANCELADA("Cancelada") {
        @Override
        public boolean podeSerCancelada(double valor) {
            return false;
        }

        @Override
        public boolean podeSerEmitida() {
            return false;
        }
    };

    private final String descricao;

    StatusNotaFiscalEnum(String descricao) {
        this.descricao = descricao;
    }

    public abstract boolean podeSerCancelada(double valor);
    public abstract boolean podeSerEmitida();

    public boolean naoPodeSerCancelada(double valor) {
        return !podeSerCancelada(valor);
    }

    public boolean naoPodeSerEmitida() {
        return !podeSerEmitida();
    }
}
