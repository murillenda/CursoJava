package cursojava.algaworks.dataapinova.desafios.calculandoperiodo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IdadePaciente {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATACO_DATA_DD_MM_YYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final LocalDate HOJE = LocalDate.now();

    public static void main(String[] args) {
        LocalDate dataNascimentoPaciente = recebeDataNascimento("Data de nascimento: ");

        Period tempoDeVivencia = dataNascimentoPaciente.until(HOJE);

        System.out.println(formatarIdadePaciente(tempoDeVivencia));
    }

    private static String formatarIdadePaciente(Period tempoDeVivencia) {
        return String.format("Paciente tem %d %s, %d %s e %d %s de vida",
            tempoDeVivencia.getYears(), tempoDeVivencia.getYears() == 1 ? "ano" : "anos",
            tempoDeVivencia.getMonths(), tempoDeVivencia.getMonths() == 1 ? "mês" : "meses",
            tempoDeVivencia.getDays(), tempoDeVivencia.getDays() == 1 ? "dia" : "dias");
    }


    private static LocalDate recebeDataNascimento(String entrada) {
        while (true) {
            try {
                System.out.print(entrada);
                String dataNascimento = ENTRADA.nextLine();

                return LocalDate.parse(dataNascimento, FORMATACO_DATA_DD_MM_YYYY);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida, tente novamente");
            }
        }
    }


}
