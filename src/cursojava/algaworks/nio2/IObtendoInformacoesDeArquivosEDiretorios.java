package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class IObtendoInformacoesDeArquivosEDiretorios {
    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda.txt");

        // Retorna o tamanho do arquivo em bytes
        System.out.println("Tamanho: " + Files.size(arquivo));

        // Retorna true caso seja arquivo
        System.out.println("É arquivo: " + Files.isRegularFile(arquivo));

        // Retorna true caso seja diretório
        System.out.println("É diretório: " + Files.isDirectory(arquivo));

        // Este método retorna um FileTime, mas podemos converter para Instant
        Instant ultimaAlteracao = Files.getLastModifiedTime(arquivo).toInstant();
        System.out.println("Última alteração: " + ultimaAlteracao);

        // Retorna true caso o arquivo é oculto
        System.out.println("É oculto: " + Files.isHidden(arquivo));

        // Arquivo pode ser lido
        System.out.println("Pode ler esse arquivo: " + Files.isReadable(arquivo));

        // Pode escrever neste arquivo
        System.out.println("Pode escrever nesse arquivo: " + Files.isWritable(arquivo));

        // Pode escrever neste arquivo
        // No windows, arquivos .txt podem ser executaveis
        System.out.println("Pode executar esse arquivo: " + Files.isExecutable(arquivo));

        // método que verifica o tipo do arquivo
        System.out.println("É arquivo de texto simples: " + Files.probeContentType(arquivo));

        // Se você quiser verificar se o arquivo em questão é um arquivo de texto simples
        System.out.println("É arquivo de texto simples: " + Files.probeContentType(arquivo).equals("text/plain"));
    }
}
