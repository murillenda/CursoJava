package cursojava.algaworks.encapsulamento.desafio;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Fornecedor implements Serializable {
    private String nome;

    public Fornecedor() {

    }

    public Fornecedor(String nome) {
        this.nome = nome;
    }
}
