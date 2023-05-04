package cursojava.algaworks.classesaninhadas.anonimas;

import java.math.BigDecimal;

public class Conta {

    private BigDecimal saldo;

    public Conta(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Transacao efetuarPagamento(BigDecimal valor) {
        BigDecimal taxa = valor.multiply(new BigDecimal("0.10"));
        saldo = saldo.subtract(taxa).subtract(valor);

        return new Transacao() { // Criando uma classe anônima e instanciando ela ao mesmo tempo

            @Override
            public BigDecimal getValorTotal() {
                return valor.add(taxa);
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(taxa).add(valor);
            }
        };
    }

    public Transacao cobrarTarifa(BigDecimal valor) {
        saldo = saldo.subtract(valor);

        return new Transacao() {

            @Override
            public BigDecimal getValorTotal() {
                return valor;
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(valor);
            }
        };
    }

}
