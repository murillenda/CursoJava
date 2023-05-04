package cursojava.algaworks.trabalhandocomnumeros.decimalformat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class TransformaStringEmNumeros {
    public static void main(String[] args) throws ParseException {
        String texto = "1.000,43"; // Atenção ao formato

        NumberFormat formatador = new DecimalFormat("#,##0.00");
        // Parse retorna um Number
        // Number valor = formatador.parse(texto);

        // Assim perdemos precisão
        // double valor = formatador.parse(texto).doubleValue();

        // Se fizermos assim da ClassCastException
        // BigDecimal valor = (BigDecimal) formatador.parse(texto);

        // Então o correto é a gente configurar o format pra isso
        DecimalFormat formatadorConfigurado = new DecimalFormat("#,##0.00");
        formatadorConfigurado.setParseBigDecimal(true); // O default desse método é false

        // Parse continua retornando um Number, mas agora o BigDecimal não da ClasCastException.
        BigDecimal valor = (BigDecimal) formatadorConfigurado.parse(texto);
        System.out.println(texto);
        BigDecimal total = valor.add(new BigDecimal("1000"));

        System.out.println(total);
    }
}
