package cursojava.algaworks.lambda.interfacesfuncionais.as4principais;

import java.time.LocalDate;
import java.util.function.Function;

public class FunctionFunctional {
    public static void main(String[] args) {
        // Função que recebe um objeto e retorna outro
        Function<String, LocalDate> function = str -> LocalDate.parse(str);
        LocalDate data = function.apply("2023-09-13");
        System.out.println(data); // Retorna um localDate
    }
}
