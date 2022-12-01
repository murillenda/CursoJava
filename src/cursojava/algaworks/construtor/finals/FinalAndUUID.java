package cursojava.algaworks.construtor.finals;

import java.util.Objects;
import java.util.UUID;

public class FinalAndUUID {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    final String codigo;
    String nome;
    int quantidadeEstoque;

    FinalAndUUID() throws IllegalAccessException {
        this("Sem nome");
    }

    FinalAndUUID(String nome) throws IllegalAccessException {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    FinalAndUUID(String nome, int estoqueInicial) throws IllegalAccessException {
        Objects.requireNonNull(nome, "Nome é obrigatório");
        if (estoqueInicial < 0) {
            throw new IllegalAccessException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString(); //A Universally Unique IDentifier (UUID)
    }
}
