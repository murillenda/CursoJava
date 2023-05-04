package cursojava.algaworks.collections.linkedlists;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Hotel implements Comparable<Hotel> {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(getNome(), hotel.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public int compareTo(Hotel o) {
        // Recomendado é que essa implementação use a mesma propriedade que a gente usa pra implementar o método equals
        // Ou seja, se no equals comparamos por nome, aqui também comparamos por nome...
        return getNome().compareTo(o.getNome());

        // return Double.compare(getPrecoDiaria(), o.getPrecoDiaria());

        /*
        return Double.valueOf(getPrecoDiaria())
            .compareTo(Double.valueOf(o.getPrecoDiaria()));
        */

        // nao é bom usar os operadores lógicos dentro das condições
        /*
        if (this.getPrecoDiaria() < o.getPrecoDiaria()) { // Retornamos negativo, caso esse obj for menor que o obj que recebemos
            return -1;
        } else if (this.getPrecoDiaria() > o.getPrecoDiaria()) {
            return 1;
        } else {
            return 0;
        }

         */
    }

}
