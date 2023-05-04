package cursojava.algaworks.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SPrincipalBufferedReaderCorrecaoProblema {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda.txt");

        // BufferedReader lê linha a linha e evita o problema de quebrar no meio os caractere especial
        // Também da pra fazer com o BufferedWriter...
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines().forEach(System.out::println);
        }
    }
}
