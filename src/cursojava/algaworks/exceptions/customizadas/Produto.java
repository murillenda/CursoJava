package cursojava.algaworks.exceptions.customizadas;

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

    public void retirarEstoque(int quantidade) throws ProdutoSemEstoqueException, ProdutoInativoException {
        if (quantidadeIsInvalida(quantidade)) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque");
        }

        if (quantidadeEstoqueFicariaNegativo(quantidade)) {
            throw new ProdutoSemEstoqueException("Estoque insuficiente", getQuantidadeEstoque(), quantidade);
        }

        if (isInativo()) {
            throw new ProdutoInativoException("Retirada no estoque não pode ser realizada em produto inativo");
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
