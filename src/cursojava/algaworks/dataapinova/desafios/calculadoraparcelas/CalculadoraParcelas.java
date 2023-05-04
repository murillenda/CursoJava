package cursojava.algaworks.dataapinova.desafios.calculadoraparcelas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraParcelas {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static List<LocalDate> calcular() {
        LocalDate dataPrimeiraParcela = getEventLocalDate("Data da primeira parcela: ");
        int parcelas = getQuantidadeParcelas("Quantidade de parcelas: ");

        List<LocalDate> listaDatasParcelas = new ArrayList<>(parcelas);

        for (int i = 1; i <= parcelas; i++) {
            listaDatasParcelas.add(dataPrimeiraParcela.plusMonths(i - 1));
        }
        return listaDatasParcelas;
    }

    private static Integer getQuantidadeParcelas(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                Integer parcelas = ENTRADA.nextInt();

                return parcelas;
            } catch (NumberFormatException e) {
                System.out.println("Número tem que ser um inteiro");
            }
        }
    }


    private static LocalDate getEventLocalDate(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataPrimeiraParcela = ENTRADA.nextLine();

                return LocalDate.parse(dataPrimeiraParcela, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }
}
