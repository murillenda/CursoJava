package cursojava.algaworks.nio2.desafio;

import cursojava.algaworks.nio2.desafio.escritor.EscritorArquivoMaiusculo;

import java.io.IOException;
import java.nio.file.Path;

public class Principal3 {
    public static void main(String[] args) {
        try {
            var escritor = new EscritorArquivoMaiusculo(
                Path.of("src/cursojava/algaworks/nio2/desafio/escritor/arquivos/poema1.txt"),
                Path.of("src/cursojava/algaworks/nio2/desafio/escritor/arquivos/poema2.txt"));
            escritor.processar();
        } catch (IOException e) {
            System.out.println("Erro processando e escrevendo novo arquivo");
        }
    }
}
