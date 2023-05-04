package cursojava.algaworks.collections.maps.hashmap;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Proprietario {

    private String nome;
    private String cpf;

    public Proprietario(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        Objects.requireNonNull(cpf);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            '}';
    }
}
