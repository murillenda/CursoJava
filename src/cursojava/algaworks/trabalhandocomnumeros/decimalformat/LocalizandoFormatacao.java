package cursojava.algaworks.trabalhandocomnumeros.decimalformat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class LocalizandoFormatacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Locale Estados Unidos para todas as classes do programa
        // Locale Brasil recebe código da ISO-639 -> Língua(pt)
        // Locale Brasil recebe código do país da ISO-3166 -> País(BR)
        // Locale.setDefault(new Locale("pt", "BR")); Locale BR
        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("45.362");

        // Locale BR pra quando utilizar o symbols no format
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        NumberFormat formatador = new DecimalFormat("O valor é ¤ #,##0.00;O valor é (¤ #,##0.00)", symbols);

        // Configurar a Locale para um formatador pré-definido
        NumberFormat formatadorPreDefinido = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }
}
