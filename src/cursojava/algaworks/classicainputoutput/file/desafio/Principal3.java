package cursojava.algaworks.classicainputoutput.file.desafio;

import cursojava.algaworks.classicainputoutput.file.desafio.escritor.EscritorArquivoMaiusculo;

import java.io.File;
import java.io.IOException;

public class Principal3 {
    public static void main(String[] args) {
        try {
            var escritor = new EscritorArquivoMaiusculo(
                new File("src/cursojava/algaworks/classicainputoutput/file/desafio/escritor/arquivos/poema1.txt"),
                new File("src/cursojava/algaworks/classicainputoutput/file/desafio/escritor/arquivos/poema2.txt"));
            escritor.processar();
        } catch (IOException e) {
            System.out.println("Erro processando e escrevendo novo arquivo");
        }
    }
}
