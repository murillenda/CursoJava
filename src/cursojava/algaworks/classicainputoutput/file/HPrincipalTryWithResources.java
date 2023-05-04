package cursojava.algaworks.classicainputoutput.file;

import java.io.*;

public class HPrincipalTryWithResources {
    public static void main(String[] args) throws FileNotFoundException {
        File arquivoOrigem = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/contrato.txt");

        try (InputStream inputStream = new FileInputStream(arquivoOrigem);// declaramos e instanciamos aqui dentro
             InputStream inputStream2 = new FileInputStream(arquivoOrigem)) { // E caso a gente queira instanciar mais é só colocar ;
            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print(conteudo);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
        // não precisamos mais do close no finally, pois com try-with-resources
        // nós estamos falando que estamos utiliazando algo que precisa ser fechado
        // após a inicialização
        // Ele sabe disso, pois InputStream implementa Closeable que implementa outra classe
        // chamada AutoCloseable

        // e a partir do java 9 podemos fazer assim para maior legibilidade:

        // Porém o catch não iria ficar junto...
        // Pois provavelmente você iria ter que jogar a exeption pra cima
        // Então em algumas ocasioes é melhor utilizar do outro modo mesmo
        InputStream inputStream = new FileInputStream(arquivoOrigem);
        InputStream inputStream2 = new FileInputStream(arquivoOrigem);

        try (inputStream; inputStream2) { // E caso a gente queira instanciar mais é só colocar ;
            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print(conteudo);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }
}
