package cursojava.algaworks.collections.conjuntos.desafio;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Cidade implements Comparable<Cidade> {

    private int codigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    @Override
    public String toString() {
        return "Cidade{" +
            "codigoIbge=" + codigoIbge +
            ", nome='" + nome + '\'' +
            ", totalHabitantes=" + totalHabitantes +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return getCodigoIbge() == cidade.getCodigoIbge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoIbge());
    }

    @Override
    public int compareTo(Cidade o) {
        return Integer.compare(getCodigoIbge(), o.getCodigoIbge());
    }
}
