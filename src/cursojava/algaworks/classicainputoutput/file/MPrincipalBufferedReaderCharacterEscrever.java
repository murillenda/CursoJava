package cursojava.algaworks.classicainputoutput.file;

import java.io.*;

public class MPrincipalBufferedReaderCharacterEscrever {
    public static void main(String[] args) {
        File arquivoOrigem = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/lista.txt");
        File arquivoDestino = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/saida.txt");

        try (Reader leitor = new FileReader(arquivoOrigem);
            Writer escritor = new BufferedWriter(new FileWriter(arquivoDestino))) { // buff padrão de 8192 chars
            // quando o bufferedWriter chegar em 8192 caracteres ou acabar, manda pro filewriter
            int conteudo;

            while ((conteudo = leitor.read()) != -1) {
                escritor.write(conteudo);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
