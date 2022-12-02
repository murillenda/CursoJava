package cursojava.algaworks.heranca.banco;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
public class Titular {

    private String nome;

    @Setter(AccessLevel.NONE)
    private String cpf;

    public Titular(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);
        this.nome = nome;
        this.cpf = cpf;
    }
}
