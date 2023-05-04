package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DOperacoesBasicasComFiles {
    public static void main(String[] args) throws IOException {

        Path pastaDocs = Path.of("src/cursojava/algaworks/nio2/arquivos/docs");
        // Files é da NIO2, é diferente da classe File da api clássica de I/O
        // É a classe para utilizarmos para fazer operações básicas
        //Files.createDirectory(pastaDocs);

        // Caso a gente queira criar toda a hierarquia, como por exemplo aqui
        // Onde nós estamos passando dois diretórios após a pasta docs
        // Se utilizarmos createDirectory ele vai dar erro, pois vai falar que o diretório de contratos não existe
        // Então precisamos utilizar o createDirectories para criar mais de um.
        Path pastaFornecedores = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/fornecedores");
        //Files.createDirectories(pastaFornecedores);

        Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato-venda.txt"));
        Files.createFile(arquivoContrato); // createFile cria um arquivo vazio
        System.out.println(Files.exists(arquivoContrato)); // Ver se o arquivo existe.

    }
}
