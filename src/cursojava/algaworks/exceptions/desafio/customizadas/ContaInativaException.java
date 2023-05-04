package cursojava.algaworks.exceptions.desafio.customizadas;

public class ContaInativaException extends OperacaoBancariaException {
    public ContaInativaException(String message) {
        super(message);
    }
}
