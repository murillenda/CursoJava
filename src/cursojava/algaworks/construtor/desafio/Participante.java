package cursojava.algaworks.construtor.desafio;

import lombok.Data;

import java.util.Objects;

@Data
public class Participante {

    private static final int SALDO_PONTOS_VALOR_INCIAL  = 0;

    private String nome;
    private int saldoDePontos;

    Participante(String nome) {
        this(nome, 0);
    }

    Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome, "Nome precisa ser informado");

        this.saldoDePontos = saldoDePontosInicial >= 0
            ? saldoDePontosInicial
            : SALDO_PONTOS_VALOR_INCIAL;
    }
}
