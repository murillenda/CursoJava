package cursojava.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JDiasMesesAnosParcela {
    public static void main(String[] args) {
        LocalDate dataBase = LocalDate.parse("2019-10-05");

        System.out.println("Mais 5 dias: " + dataBase.plusDays(5));

        System.out.println("Mais 9 semanas: " + dataBase.plusWeeks(9));

        System.out.println("Mais 5 anos: " + dataBase.plusYears(5));

        System.out.println("Mais 2 meses: " + dataBase.plusMonths(2));

        System.out.println("Menos 1 ano: " + dataBase.minusYears(1));
        System.out.println("Menos 1 mes: " + dataBase.minusMonths(1));
        System.out.println("Menos 20 dias: " + dataBase.minusDays(20));

        for (int parcela = 1; parcela <= 12; parcela++) {
            dataBase = dataBase.plusMonths(1);

            System.out.println("Data de vencimento do boleto: " +
                    dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês de " + dataBase.getMonth());
        }

    }
}
