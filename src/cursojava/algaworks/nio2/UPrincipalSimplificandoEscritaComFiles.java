package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class UPrincipalSimplificandoEscritaComFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/fornecedores/arquivo.txt");

        // Escrita de apenas uma pequena palavra em um arquivo de texto
        Files.writeString(path, "Opa!");

        var linhas = Arrays.asList("Opa!", "Beleza", "Mergulhador?");
        Files.write(path, linhas);

        byte[] bytes = { 79, 108, -61, -95 };
        Files.write(path, bytes);
    }
}
