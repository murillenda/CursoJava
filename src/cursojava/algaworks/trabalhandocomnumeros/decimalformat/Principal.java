package cursojava.algaworks.trabalhandocomnumeros.decimalformat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Principal {
    public static void main(String[] args) {
        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("45.362");

        // Java pega por padrão as configs do seu SO
        // Por padrão o arredondamento dele é o HALF-EVEN
        // ; indica casoPositivo;casoNegativo
        NumberFormat formatador = new DecimalFormat("O valor é ¤ #,##0.00;O valor é (¤ #,##0.00)"); // Usando o símbolo
        // ou NumberFormat formatador = new DecimalFormat("\u00A4 #,##0.00"); // Usando unicode
        // Caso queira alterar o formatador por algum motivo
        // formatador.setRoundingMode(RoundingMode.UP);

        // NumberFormat formatador = NumberFormat.getPercentInstance(); // Método de fábrica que formata números em percentual
        // NumberFormat formatador = NumberFormat.getCurrencyInstance(); // Método de fábrica que escreve como moeda

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));

    }
}
