package cursojava.algaworks.classicainputoutput.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class KPrincipalEscreverArquivosCharacter {
    public static void main(String[] args) {
        String[] nomes = {"João", "Maria", "Sebastião", "José"};
        File arquivoDestino = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/lista.txt");
        StringBuilder texto = new StringBuilder();

        try (Writer escritor = new FileWriter(arquivoDestino)) {
            for (String nome : nomes) {
                escritor.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
