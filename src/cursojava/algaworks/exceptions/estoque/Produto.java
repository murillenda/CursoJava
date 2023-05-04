package cursojava.algaworks.exceptions.estoque;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome deve ser informado");
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    public void ativar() {
        setAtivo(true);
    }

    public void desativar() {
        setAtivo(false);
    }

    public void retirarEstoque(int quantidade) {
        if (quantidadeIsInvalida(quantidade) || quantidadeEstoqueFicariaNegativo(quantidade)) {
            throw new IllegalArgumentException(quantidadeIsInvalida(quantidade)
                    ? "Quantidade não pode ser negativa para retirada no estoque"
                    : "Quantidade inválida, porque estoque ficaria negativo");
        }

        if (isInativo()) {
            throw new IllegalStateException("Retirada no estoque não pode ser realizada em produto inativo");
        }

        this.quantidadeEstoque -= quantidade;
    }

    private boolean quantidadeEstoqueFicariaNegativo(int quantidade) {
        return (getQuantidadeEstoque() - quantidade) < 0;
    }

    private boolean quantidadeIsInvalida(int quantidade) {
        return quantidade < 0;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
}
