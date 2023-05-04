package cursojava.algaworks.exceptions.customizadas;

import lombok.Getter;

@Getter
public class ProdutoSemEstoqueException extends ProdutoException {

    private final int estoqueDisponivel;
    private final int estoqueNecessario;

    public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueNecessario) {
        super(message);
        this.estoqueDisponivel = estoqueDisponivel;
        this.estoqueNecessario = estoqueNecessario;
    }
}
