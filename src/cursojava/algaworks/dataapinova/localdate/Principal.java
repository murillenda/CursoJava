package cursojava.algaworks.dataapinova.localdate;

import java.time.LocalDate;
import java.time.Month;

public class Principal {
    public static void main(String[] args) {
        // Sempre no padrão ISO-8601
        LocalDate datahoje = LocalDate.now(); // apenas a DATA atual
        LocalDate dataNascimento = LocalDate.of(2000, Month.MAY, 28); // Colocando uma data específica
        LocalDate diaDoProgramador = LocalDate.ofYearDay(2023, 256); // Coolcando um dia específico do ano

        System.out.println(diaDoProgramador);
        System.out.println(dataNascimento);
        System.out.println(datahoje);
    }
}
