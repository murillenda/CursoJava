package cursojava.algaworks.classicainputoutput.file;

import java.io.*;

public class LPrincipalBufferedReaderCharacterLer {
    public static void main(String[] args) {
        File arquivoOrigem = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/contrato.txt");

        // Para ler o File linha a linha, iremos embrulhar esse FileReader dentro de um BufferedReader
        // Então sempre que fizermos alguma operação no leitos, sempre iremos passar primeiro
        // pelo bufferedreader, e ele vai usar o fileReader
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem))) {
            String linha = null;

            while ((linha = leitor.readLine()) != null) { // retorna toda string de uma linha
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O: ", e);
        }
    }
}
