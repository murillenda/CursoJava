package cursojava.algaworks.lambda.interfacesfuncionais.function.algunsexemplos;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    public enum Status {
        ATIVO, INATIVO
    }

    private String nome;
    private BigDecimal preco;
    private int quantidade;
    private Status status = Status.ATIVO;

    public Produto(String nome, BigDecimal preco, int quantidade) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, BigDecimal preco, int quantidade, Status status) {
        this(nome, preco, quantidade);
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Status getStatus() {
        return status;
    }

    public void inativar() {
        status = Status.INATIVO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cursojava.algaworks.lambda.interfacesfuncionais.predicate.algunsexemplos.Produto produto = (cursojava.algaworks.lambda.interfacesfuncionais.predicate.algunsexemplos.Produto) o;
        return Objects.equals(getNome(), produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "Produto{" +
            "nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            ", status=" + status +
            '}';
    }
}
