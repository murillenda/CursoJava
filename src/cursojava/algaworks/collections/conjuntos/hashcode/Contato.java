package cursojava.algaworks.collections.conjuntos.hashcode;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Contato implements Comparable<Contato> {

    private String nome;
    private String email;
    private int idade;

    public Contato(String nome, String email, int idade) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(email);
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contato{" +
            "nome='" + nome + '\'' +
            ", email='" + email + '\'' +
            ", idade=" + idade +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.printf("%s = %s%n", getEmail(), ((Contato) o).getEmail());
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return getEmail().equals(contato.getEmail());
    }

    @Override
    public int hashCode() {
        return email.charAt(0);
    }

    @Override
    public int compareTo(Contato o) {
        System.out.printf("CompareTo %s = %s%n", getEmail(), o.getEmail());
        return getEmail().compareTo(o.getEmail());
    }
}
