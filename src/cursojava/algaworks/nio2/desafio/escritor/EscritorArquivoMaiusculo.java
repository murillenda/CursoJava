package cursojava.algaworks.nio2.desafio.escritor;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public final class EscritorArquivoMaiusculo {
    private final Path arquivoOrigem;
    private final Path arquivoDestino;

    public EscritorArquivoMaiusculo(Path arquivoOrigem, Path arquivoDestino) {
        Objects.requireNonNull(arquivoOrigem);
        Objects.requireNonNull(arquivoDestino);
        this.arquivoOrigem = arquivoOrigem;
        this.arquivoDestino = arquivoDestino;
    }

    public void processar() throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try (BufferedReader leitor = Files.newBufferedReader(arquivoOrigem);
             BufferedWriter escritor = Files.newBufferedWriter(arquivoDestino)) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                escreverArquivoEmMaiusculo(linha, escritor);
            }
        }
    }

    private void escreverArquivoEmMaiusculo(String linha, BufferedWriter escritor) throws IOException {
        escritor.write(linha.toUpperCase());
        escritor.newLine();
    }

}
