package cursojava.algaworks.trabalhandocomnumeros.desafio;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Cambio {
    public static void main(String[] args) throws ParseException {
        String valorEmDolarString = "1,300.10";
        String cotacaoString = "5,34";

        DecimalFormat formatadorConfiguradoBr = new DecimalFormat("#,##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR")));
        formatadorConfiguradoBr.setParseBigDecimal(true);

        DecimalFormat formatadorConfiguradoUs = new DecimalFormat("#,##0.00",
            new DecimalFormatSymbols(Locale.US));
        formatadorConfiguradoUs.setParseBigDecimal(true);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        NumberFormat formatValorFinalReal = new DecimalFormat("¤ #,##0.00", symbols);

        BigDecimal valorEmDolarBigDecimal = (BigDecimal) formatadorConfiguradoUs.parse(valorEmDolarString);
        BigDecimal cotacaoBigDecimal = (BigDecimal) formatadorConfiguradoBr.parse(cotacaoString);
        BigDecimal valorConvertido = converterDolaresParaReais(valorEmDolarBigDecimal, cotacaoBigDecimal);

        System.out.println(formatValorFinalReal.format(valorConvertido));

    }

    private static BigDecimal converterDolaresParaReais(BigDecimal valorDolar, BigDecimal cotacaoDolar) {
        return valorDolar.multiply(cotacaoDolar);
    }
}
