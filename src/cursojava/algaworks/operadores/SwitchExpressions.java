package cursojava.algaworks.operadores;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
        String diaSemana = entrada.nextLine();

        System.out.print("Digite o mês: ");
        int mes = entrada.nextInt();

        String horarioFuncionamento = switch (diaSemana) {
            case "seg" -> {
                if (mes == 12) {
                    yield "08:00 às 16:00";				// Utiliza-se o yield caso tenha uma lógica
                }                               // Então caso for mês 12, só retornara o if
                yield "Fechado";
            }
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" -> "08:00 às 12:00";
            default -> "Dia inválido";
        };

        System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
    }
}
