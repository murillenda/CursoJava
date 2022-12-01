package cursojava.algaworks.poo.exerciciopoo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ContratoTrabalho {
    private static final double DEZ_POR_CENTO = 0.10;

    private Funcionario funcionario;
    private BigDecimal valorHoraNormal;
    private BigDecimal valorHoraExtra;

    protected BigDecimal calcularValorAdicionalFilhos(BigDecimal salarioDevido) {
        return salarioDevido.multiply(new BigDecimal(DEZ_POR_CENTO));
    }
}
