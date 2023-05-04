package cursojava.algaworks.dataapinova.desafios.calculadoraparcelas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Principal {

    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        List<LocalDate> listaDatasParcelas = CalculadoraParcelas.calcular();

        for (LocalDate parcela : listaDatasParcelas) {
            Integer index = listaDatasParcelas.indexOf(parcela) + 1;
            System.out.printf("Parcela #%d - %s%n", index, parcela.format(FORMATADOR_DATA));
        }
    }
}
