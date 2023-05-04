package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ECopiandoArquivosEDiretorios {
    public static void main(String[] args) throws IOException {
        Path pastaFornecedores = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/fornecedores");
        Path arquivoContrato = Path.of("contrato-venda.txt");
        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);

        Path pastaClientes = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes");
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

        System.out.println(arquivoContratoOrigem);
        System.out.println(arquivoContratoDestino);

        // Copiar arquivo passando origem e destino nesse construtor, passando todo o conteúdo dentro.
        // Caso tentarmos fazer uma cópia de um arquivo para um destino que já exista esse arquivo
        // ele não substitui, ele da exceção de FileAlreadyExistsException
        Files.copy(arquivoContratoOrigem, arquivoContratoDestino);

        // Caso a gente queira tratar isso, para quando já existir o arquivo
        // ele substituir o arquivo já existente na pasta, utilizamos esse terceiro parâmetro
        // que é um CopyOption, a classe que implementa ela é a StandardCopyOption com algumas constantes
        // nesse caso é a substituição
        Files.copy(arquivoContratoOrigem, arquivoContratoDestino, StandardCopyOption.REPLACE_EXISTING);

        // Copiando os arquivos da pasta para outra pasta geralmente é feita usando
        // uma funcionalidade chamada walking file tree, mais pra frente estudamos esta funcionalidade
    }
}
