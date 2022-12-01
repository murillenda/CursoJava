package cursojava.algaworks.poo.exerciciopoo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
    private String nome;
    private Integer quantidadeDeFilhos;

    boolean possuiFilho() {
        return quantidadeDeFilhos >= 1;
    }

    protected void imprimirInformacoesFuncionario() {
        System.out.printf("Nome do funcionário: %s%n", nome);
        var informacoesFilho = possuiFilho()
            ? "Funcionário possui filhos, "
            : "Funcionário não possui filhos, ";

        String filhosFuncionario = String.format("quantidade de filhos do funcionário: %d", quantidadeDeFilhos);

        System.out.println(informacoesFilho + filhosFuncionario);
    }
}
