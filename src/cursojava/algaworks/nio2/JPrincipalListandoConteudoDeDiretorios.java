package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JPrincipalListandoConteudoDeDiretorios {
    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("src/cursojava/algaworks/nio2");

        // Retorna um Stream de Path
        // O Stream nesse caso precisa ser fechado, pois estamos utiliando I/O
        // Então precisamos usar o try-with-resources
        try (var stream = Files.list(pasta)) {
            stream.filter(Files::isRegularFile)
                .map(Path::getFileName)
                .map(Path::toString)
                .filter(nome -> nome.matches(".*\\.java"))
                .forEach(System.out::println);
        }
    }
}
