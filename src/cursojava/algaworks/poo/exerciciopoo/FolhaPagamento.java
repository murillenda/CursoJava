package cursojava.algaworks.poo.exerciciopoo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class FolhaPagamento {

    public Holerite calcularSalario(Integer horasNormaisTrabalhadas,
                             Integer horasExtrasTrabalhadas,
                             ContratoTrabalho contratoTrabalho) {
        Objects.requireNonNull(horasNormaisTrabalhadas, "Quantidade de horas normais deve ser informado");
        Objects.requireNonNull(horasExtrasTrabalhadas, "Quantidade de horas extras deve ser informado");
        Objects.requireNonNull(contratoTrabalho, "Contrato deve ser informado");

        var valorTotalHorasExtras = new BigDecimal(BigInteger.ZERO);
        var valorAdicionalFilhos = new BigDecimal(BigInteger.ZERO);

        BigDecimal valorTotalHorasNormais = calcularHorasNormaisTrabalhadas
            (contratoTrabalho, horasNormaisTrabalhadas);
        BigDecimal salarioFinal = valorTotalHorasNormais;

        var trabalhouHorasExtras = horasExtrasTrabalhadas >= 0;

        if (trabalhouHorasExtras) {
            valorTotalHorasExtras = calcularHorasExtrasTrabalhadas
                (contratoTrabalho, horasExtrasTrabalhadas);
            salarioFinal = somarHorasExtrasAoSalarioFinal(salarioFinal, valorTotalHorasExtras);
        }

        boolean possuiFilho = contratoTrabalho.getFuncionario().possuiFilho();

        if (possuiFilho) {
            valorAdicionalFilhos = contratoTrabalho.calcularValorAdicionalFilhos(salarioFinal);
        }

        return new Holerite(
            contratoTrabalho.getFuncionario(),
            valorTotalHorasNormais,
            valorTotalHorasExtras,
            valorAdicionalFilhos);
    }

    private BigDecimal calcularHorasNormaisTrabalhadas(ContratoTrabalho contratoTrabalho,
                                               Integer horasNormaisTrabalhadas) {
        return contratoTrabalho.getValorHoraNormal()
            .multiply(BigDecimal.valueOf(horasNormaisTrabalhadas));
    }

    private BigDecimal somarHorasExtrasAoSalarioFinal(BigDecimal salarioFinal,
                                              BigDecimal valorTotalHorasExtras) {
        return salarioFinal.add(valorTotalHorasExtras);
    }

    private BigDecimal calcularHorasExtrasTrabalhadas(ContratoTrabalho contratoTrabalho,
                                              Integer horasExtrasTrabalhadas) {
        return contratoTrabalho.getValorHoraExtra()
            .multiply(BigDecimal.valueOf(horasExtrasTrabalhadas));
    }
}
