package cursojava.algaworks.classicainputoutput.file.desafio.escritor;

import java.io.*;
import java.util.Objects;

public record EscritorArquivoMaiusculo(File arquivoOrigem, File arquivoDestino) {

    public EscritorArquivoMaiusculo {
        Objects.requireNonNull(arquivoOrigem);
        Objects.requireNonNull(arquivoDestino);
    }

    public void processar() throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                escreverArquivo(linha, escritor);
            }
        }
    }

    private void escreverArquivo(String linha, BufferedWriter escritor) throws IOException {
        escritor.write(linha.toUpperCase());
        escritor.newLine();
    }
}
