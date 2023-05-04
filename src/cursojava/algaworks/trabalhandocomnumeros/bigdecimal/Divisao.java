package cursojava.algaworks.trabalhandocomnumeros.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divisao {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("10.0");
        BigDecimal y = new BigDecimal("3.0");

        // Se não for uma divisão exata, o BigDecimal não consegue decidir como fazer essa divisão
        // Temos que falar pra ele qual a forma de arredondamento que queremos utilizar.
        // BigDecimal z = x.divide(y);

        // colocamos a sobrecarga do divide que é (dividir por quanto, casas decimais do resultado, tipo de arredondamento)
        BigDecimal arredondamentoCima = x.divide(y, 4, RoundingMode.UP); // Cima
        BigDecimal arredondamentoBaixo = x.divide(y, 4, RoundingMode.DOWN); // Baixo
        // Estatisticamente esse modo de arredondamento, minimiza erros cumulativos
        // quando é usado repetido em uma sequencia de cálculos.
        // 2.524 = 2.52
        // 2.526 = 2.53
        // 2.525 = 2.53 Ele arredonda pra cima caso o digito a esquerda
        // do digito que for arredondado seja impar, caso seja par, pra baixo
        // 2.425 = 2.42
        BigDecimal z = x.divide(y, 4, RoundingMode.HALF_EVEN); // Bankers Round(arredondamento bancário)

        System.out.println(z);
    }
}
