package cursojava.algaworks.enumeracoes.desafio;

import lombok.Getter;

@Getter
public class NotaFiscal {

    private final Integer numero;
    private final String descricao;
    private final double valor;
    private StatusNotaFiscalEnum status = StatusNotaFiscalEnum.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void cancelar() {
        if (getStatus().naoPodeSerCancelada(getValor())) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        status = StatusNotaFiscalEnum.CANCELADA;
    }

    public void emitir() {
        if (getStatus().naoPodeSerEmitida()) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        status = StatusNotaFiscalEnum.EMITIDA;
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
            getNumero(), getDescricao(), getValor(), getDescricaoStatus());
    }

    private String getDescricaoStatus() {
        return getStatus().getDescricao();
    }
}
