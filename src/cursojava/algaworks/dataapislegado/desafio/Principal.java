package cursojava.algaworks.dataapislegado.desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String dataPrimeiraParcela = scanner.nextLine();

        System.out.print("Quantidade de parcelas: ");
        Integer parcelas = scanner.nextInt();

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formatador.parse(dataPrimeiraParcela);

        List<String> datasParcelas = CalculadorParcelas.calcular(data, parcelas, formatador);

        for (int i = 1; i < parcelas + 1; i++) {
            imprimirParcelas(datasParcelas.get(i - 1), i);
        }
    }

    private static void imprimirParcelas(String dataParcela, Integer indice) {
        System.out.printf("Parcela #%d - %s%n", indice, dataParcela);
    }
}
