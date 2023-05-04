package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class GPrincipalExcluindoArquivosEDiretorios {
    public static void main(String[] args) throws IOException {
        Path arquivoContrato = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda.txt");
        // Lança uma exceção caso o arquivo não exista
        Files.delete(arquivoContrato);
        // Caso não queira que lance exceção se o arquivo não existir usar esse
        Files.deleteIfExists(arquivoContrato);

        // Também pode ser utilizado para excluir pastas
        // Porém se tiver arquivos dentro desta pasta ele lança uma exceção
        // DirctoryNotEmptyExecption
        Path pastaFornecedores = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/fornecedores");
        Files.delete(pastaFornecedores);

        // Caso queira que exclua mesmo com arquivos dentro da pasta, tem que ir excluindo tudo de dentro para
        // depois excluir os de fora.
        // uma forma de implementar isso é usando walk file tree, que vai ser visto na proxima aula
    }
}
