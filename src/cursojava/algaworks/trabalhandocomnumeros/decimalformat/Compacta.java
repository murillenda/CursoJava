package cursojava.algaworks.trabalhandocomnumeros.decimalformat;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Compacta {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("398.22");
        BigDecimal b = new BigDecimal("2469.44");
        BigDecimal c = new BigDecimal("4142298.42");
        BigDecimal d = new BigDecimal("8404142298.0"); // 8bi de forma compacta de acordo com a CLDR


        NumberFormat formatador = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }
}
