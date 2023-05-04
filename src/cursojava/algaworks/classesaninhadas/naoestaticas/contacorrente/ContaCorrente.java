package cursojava.algaworks.classesaninhadas.naoestaticas.contacorrente;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class ContaCorrente {

    private BigDecimal saldo;
    private List<Transacao> transacoes = new ArrayList<>();

    public ContaCorrente(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getTransacoes() {
        return Collections.unmodifiableList(transacoes);
    }

    @Getter
    public class Transacao {

        private String descricao;
        private BigDecimal valor;
        // private BigDecimal saldo;

        public Transacao(String descricao, BigDecimal valor) {
            this.descricao = descricao;
            this.valor = valor;

            ContaCorrente.this.saldo = saldo.subtract(valor); // Subtraímos o saldo
            ContaCorrente.this.transacoes.add(this); // Adicionamos na lista a Instancia atual
        }
    }

}
