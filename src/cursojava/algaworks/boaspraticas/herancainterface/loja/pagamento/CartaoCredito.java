package cursojava.algaworks.boaspraticas.herancainterface.loja.pagamento;

import lombok.Getter;

@Getter
public class CartaoCredito implements MetodoPagamento {

    private final String numero;

    public CartaoCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void pagar(double valor) {
        if (!numero.startsWith("123")) {
            throw new RuntimeException("Pagamento negado");
        }

        System.out.printf("Pagamento de R$%.2f realizado. Cartão de crédito %s%n", valor, getNumero());
    }
}
