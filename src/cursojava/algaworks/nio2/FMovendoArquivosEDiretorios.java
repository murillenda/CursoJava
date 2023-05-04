package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FMovendoArquivosEDiretorios {
    public static void main(String[] args) throws IOException {
        Path pastaFornecedores = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/fornecedores");
        Path pastaClientes = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes");
        Path arquivoContrato = Path.of("contrato-venda.txt");

        Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContrato);
        Path arquivoContratoDestino = pastaClientes.resolve(arquivoContrato);

        // Movendo arquivo
        Files.move(arquivoContratoOrigem, arquivoContratoDestino);

        // Ele move a pasta clientes para o novo caminho da pastaVendas renomeando o arquivo para o nome vendas
        Path pastaVendas = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/vendas");
        Files.move(pastaClientes, pastaVendas);
    }
}
