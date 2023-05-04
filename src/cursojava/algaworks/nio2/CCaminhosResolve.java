package cursojava.algaworks.nio2;

import java.nio.file.Path;

public class CCaminhosResolve {
    public static void main(String[] args) {
        Path pasta = Path.of("src/cursojava/algaworks/nio2/arquivos");
        Path arquivo = Path.of("contrato.txt");

        // Com resolve, conseguimos fazer o arquivo ser o caminho dentro dessa pasta aqui
        Path arquivoResolvido = pasta.resolve(arquivo);
        System.out.println(arquivoResolvido);
        System.out.println(arquivoResolvido.toAbsolutePath());
    }
}
