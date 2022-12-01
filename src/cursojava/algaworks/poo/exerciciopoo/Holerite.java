package cursojava.algaworks.poo.exerciciopoo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
public class Holerite {

    private Funcionario funcionario;
    private BigDecimal valorTotalHorasNormais;
    private BigDecimal valorTotalHorasExtras;
    private BigDecimal valorTotalAdicionalFilhos;

    public void imprimirContraCheque() {
        BigDecimal valorTotal = calcularValorTotal();
        funcionario.imprimirInformacoesFuncionario();
        imprimirValoresHorasTrabalhadasFuncionario(valorTotal);
        imprimirValorTotalDevidoAoFuncionario(valorTotal);
    }

    private BigDecimal calcularValorTotal() {
        return valorTotalHorasNormais.add(valorTotalHorasExtras.add(valorTotalAdicionalFilhos));
    }

    private void imprimirValoresHorasTrabalhadasFuncionario(BigDecimal valorTotal) {
        String valorTotalHorasNormaisFormatStr =
            retornaValorTotalHorasNormaisFormatadoParaString(valorTotalHorasNormais);
        String valorTotalHorasExtrasFormatStr =
            retornaValorTotalHorasExtrasFormatadoParaString(valorTotalHorasExtras);
        String valorTotalFormatStr = retornaValorTotalFormatadoParaString(valorTotal);

        System.out.printf("Valor Horas normais trabalhadas: R$%s%n", valorTotalHorasNormaisFormatStr);
        System.out.printf("Valor Horas extras trabalhadas: R$%s%n", valorTotalHorasExtrasFormatStr);
        System.out.printf("Valor Total Devido: R$%s%n", valorTotalFormatStr);
    }

    private String retornaValorTotalFormatadoParaString(BigDecimal valorTotal) {
        return DecimalUtils.formatarBigDecimal(valorTotal);
    }

    private String retornaValorTotalHorasNormaisFormatadoParaString(BigDecimal valorTotalHorasNormais) {
        return DecimalUtils.formatarBigDecimal(valorTotalHorasNormais);
    }

    private String retornaValorTotalHorasExtrasFormatadoParaString(BigDecimal valorTotalHorasExtras) {
        return DecimalUtils.formatarBigDecimal(valorTotalHorasExtras);
    }

    private void imprimirValorTotalDevidoAoFuncionario(BigDecimal valorTotal) {
        String valorTotalFormatStr = retornaValorTotalFormatadoParaString(valorTotal);
        System.out.printf("Salário a pagar para %s: %s", funcionario.getNome(), valorTotalFormatStr);
    }
}
