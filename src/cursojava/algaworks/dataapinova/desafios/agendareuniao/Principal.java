package cursojava.algaworks.dataapinova.desafios.agendareuniao;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA_COMPLETA = DateTimeFormatter
        .ofLocalizedDate(FormatStyle.FULL)
        .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        // Pre-requisitos: Usar a class Year, Enum Month, Class MonthYear, porém pode usar as outras também.
        // TODO Criar uma agenda anual de reuniões
        // As reuniões ocorrem em toda primeira segunda de cada mês

        Year ano = recebeAno("Ano: ");
        Month mesInicial = receberMesAno("Mês inicial: ");

        YearMonth mesAno = ano.atMonth(mesInicial);

        List<LocalDate> listaDatasReunioes = calculaReunioes(mesAno);

        System.out.printf("Gerando agenda anual de reuniões {%s} desde %s%n",
            ano, mesInicial.getDisplayName(TextStyle.FULL, Locale.US));

        for (LocalDate dataReuniao : listaDatasReunioes) {
            System.out.println(dataReuniao.format(FORMATADOR_DATA_COMPLETA));
        }

    }

    private static List<LocalDate> calculaReunioes(YearMonth mesAno) {
        List<LocalDate> datasReunioes = new ArrayList<>(Month.DECEMBER.getValue());

        for (int mes = mesAno.getMonthValue(); mes < Month.DECEMBER.getValue(); mes++) {
            datasReunioes.add(mesAno.withMonth(mes).atDay(1)
                .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));
        }
        return datasReunioes;
    }

    private static Month receberMesAno(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                int mesAnoInicial = ENTRADA.nextInt();

                return Month.of(mesAnoInicial);
            } catch (DateTimeException e) {
                System.out.println("Mês inválido, informe um válido");
            }
        }
    }

    private static Year recebeAno(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String anoStr = ENTRADA.nextLine();

                return Year.parse(anoStr);
            } catch (DateTimeParseException e) {
                System.out.println("Ano inválido, informe novamente");
            }
        }
    }
}
