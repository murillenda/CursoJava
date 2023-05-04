package cursojava.algaworks.exceptions.desafio.customizadas;

public class SaldoInsuficienteException extends OperacaoBancariaException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
