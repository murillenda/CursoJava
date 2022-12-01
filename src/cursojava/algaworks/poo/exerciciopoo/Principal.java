package cursojava.algaworks.poo.exerciciopoo;

import java.math.BigDecimal;

public class Principal {
    private static final Integer HORAS_NORMAIS_TRABALHADAS = 8;
    private static final Integer HORAS_EXTRAS_TRABALHADAS = 1;
    public static void main(String[] args) {
        var funcionarioSergio = new Funcionario();
        funcionarioSergio.setNome("Sérgio");
        funcionarioSergio.setQuantidadeDeFilhos(3);

        var contratoSergio = new ContratoTrabalho();
        contratoSergio.setValorHoraExtra(BigDecimal.valueOf(115));
        contratoSergio.setValorHoraNormal(BigDecimal.valueOf(150));
        contratoSergio.setFuncionario(funcionarioSergio);

        var folhaPagamentoSergio = new FolhaPagamento();
        Holerite holeriteSergio = folhaPagamentoSergio.calcularSalario(
            HORAS_NORMAIS_TRABALHADAS, HORAS_EXTRAS_TRABALHADAS, contratoSergio);
        holeriteSergio.imprimirContraCheque();
    }
}
