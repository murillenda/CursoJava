package cursojava.algaworks.trabalhandocomnumeros.bigdecimal;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        // O melhor é passar os valores em String
        BigDecimal valorTotal = new BigDecimal("2.05");
        BigDecimal valorPago = new BigDecimal("1.05");

        // BigDecimal armazena o valor usando base decimal
        // para isso acontecer, as operações dele são mais lentas

        BigDecimal valorSoma = valorTotal.add(valorPago);
        BigDecimal valorSubtracao = valorTotal.subtract(valorPago);
        BigDecimal valorMultiplicacao = valorTotal.multiply(valorPago);
        // 0 = valores iguais, -1 = valorTotal menor que valor pago, 1 = valorTotal maior que valor pago
        int comparacao = valorTotal.compareTo(valorPago);


        System.out.println(valorSoma);

    }
}
