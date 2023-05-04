package cursojava.algaworks.classicainputoutput.file;

import java.io.*;

public class IPrincipalEscreverArquivos {
    public static void main(String[] args) {
        File arquivoOrigem = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/picanha.jpg");
        File arquivoDestino = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/foto2.jpg");

        try (InputStream inputStream = new FileInputStream(arquivoOrigem);
             OutputStream outputStream = new FileOutputStream(arquivoDestino)) { // Passamos a saída
            // int conteudo;
            byte[] conteudo = new byte[1024]; // equivalente a 1kb, com isso vamos ler de 1kb a 1kb ao invés de byte a byte
            int quantidadeBytes;

            // Ele ler byte a byte pode ser um problema com arquivos muitos grandes, então podemos utilizar um Lote
            // ou seja, um Buffer para otimizar isso
            // Utiliazmos uma sobrecarga do método read que passamos o array de bytes para onde queremos ler
            while ((quantidadeBytes = inputStream.read(conteudo)) > 0) { // Agora essa variável não retorna mais o conteúdo em si, mas sim quantos bytes ele conseguiu ler
                // outputStream.write(conteudo); // passamos o byte que a gente quer escrever para ele escrever
                outputStream.write(conteudo, 0, quantidadeBytes); //sobrecarga para receber a posição inicial do array de bytes até a quantidade que ele conseguiu ler
                // Então é criado a foto2.jpg que é uma cópia da picanha.jpg
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
