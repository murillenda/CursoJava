package cursojava.algaworks.encapsulamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cartao {
    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public void debitar(double valorDebito) {
        if (getSaldo() < valorDebito) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }
        saldo -= valorDebito;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                String.format("Valor de depósito não pode ser menor que %.2f", VALOR_MINIMO_DEPOSITO));
        }
        saldo += valorDeposito;
    }
}
