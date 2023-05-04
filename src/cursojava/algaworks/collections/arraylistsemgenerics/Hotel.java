package cursojava.algaworks.collections.arraylistsemgenerics;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Hotel {

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        setNome(nome );
        setCidade(cidade);
        setPrecoDiaria(precoDiaria);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            throw new IllegalArgumentException("Preço da diária não pode ser negativo");
        }
        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
            "nome='" + nome + '\'' +
            ", cidade='" + cidade + '\'' +
            ", precoDiaria=" + precoDiaria +
            '}';
    }

}
