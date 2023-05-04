package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class KPrincipalPesquisandoArquivosEmUmaPastaESubPastas {
    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("src/cursojava/algaworks/nio2");

        // Quando queremos nos aprofundar na hierarquia das pastas incluindo subdiretórios, utilizamos find
        // 1° argumento: ponto de partida de onde queremos iniciar a pesquisa, daí pra baixo, é um Path
        // 2° argumento: profundidade máxima, quantos níveis de pasta queremos fazer a busca, é um int, se quisermos muito, colcoa um número grande
        // 3° argumento: É um Bipredicate que recebe 2 argumentos, um Path e um BasicFileAttributes
        // BasicFileAttributes são informações básicas para por exemplo saber se é arquivo ou diretório, tamanho do arquivo e etc
        // enquanto o algoritimo estiver vasculhando os arquivos e pastas dentro dessa profundidade
        // para fazermos algum processamento, ele vai fazer uma checagem para ver se o Predicate é true or false
        // então ele só vai encontrar arquivos onde esse BiPredicate retornar true
        // Também retorna um stream de Path, então precisa ser fechado para liberar os recursos de I/O
        try (var stream = Files.find(pasta, Integer.MAX_VALUE,
            (path, attrs) -> path.getFileName().toString().matches(".*\\.txt"))) {
            stream.forEach(System.out::println);
        }
    }
}
