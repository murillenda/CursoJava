package cursojava.algaworks.poo.exerciciopoo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DecimalUtils {
    public static String formatarBigDecimal(BigDecimal numeroParaFormatar) {
        var df = new DecimalFormat("#,###.00");

        return numeroParaFormatar.compareTo(BigDecimal.ZERO) != 0
        ? df.format(numeroParaFormatar)
        : "0.00";
    }
}
