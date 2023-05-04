package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TPrincipalSimplificandoLeituraComFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda.txt");

        // Retorna uma Stream de String
        // Lembre que você precisa fechar o Stream, pois estamos trabalhando com I/O
        try (var stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }

        // Retorna uma List de String, e nele já abre e fecha automaticamente o fluxo
        // Não fazer isso para arquivos gigantes, se não vai estourar a memória.
        Files.readAllLines(path)
            .forEach(System.out::println);

        // Supondo que você saiba que o arquivo é pequeno
        // Retorna uma String com todos o conteúdo que está lendo, e também abre e fecha o channel internamente
        Files.readString(path);

        // Caso esteja trabalhando com bytes e arquivos pequenos
        // Retorna um array de bytes
        Files.readAllBytes(path);
    }
}
