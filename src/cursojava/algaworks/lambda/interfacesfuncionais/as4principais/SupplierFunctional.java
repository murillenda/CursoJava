package cursojava.algaworks.lambda.interfacesfuncionais.as4principais;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierFunctional {
    public static void main(String[] args) {
        // Não recebe argumento, só retorna um objeto do tipo T
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime dataHora = supplier.get();
        System.out.println(dataHora);
    }
}
