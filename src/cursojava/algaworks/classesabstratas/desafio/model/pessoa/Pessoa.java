package cursojava.algaworks.classesabstratas.desafio.model.pessoa;

import lombok.Getter;

import java.util.Objects;

@Getter
public abstract class Pessoa {

    private String nome;

    protected Pessoa(String nome) {
        setNome(nome);
    }

    private void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.nome = nome;
    }

    public abstract double calcularImpostos();

    @Override
    public String toString() {
        return "Pessoa{" +
            "nome='" + nome + '\'' +
            '}';
    }
}
