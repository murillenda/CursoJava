package cursojava.algaworks.classicainputoutput.file;

import java.io.File;
import java.io.IOException;

public class FPrincipalListarArquivosEDiretorios {
    public static void main(String[] args) throws IOException {
        File pasta = new File("src/cursojava").getCanonicalFile();

        // Pegamos uma instancia de File e chamamos o método listFiles para listar todos o conteúdo da pasta docs
        // Serve para arquivos ou pastas
        File[] arquivos = pasta.listFiles();

        // Precisa fazer essa validação, pois a forma que foi implementado esse método listFiles
        // caso não encontre as informações, ele vai retornar null
        // e ai teriamos um NullPointerException
        // (api antiga)
        if (arquivos != null) {
            // Lista todos os arquivos e pastas dentro dessa pasta
            for (File arquivo : arquivos) {
                System.out.println(arquivo);
                System.out.println(arquivo.getName());
            }
        }
        // Ele não é recurssivo, então só lista os filhos dele, e não o que tem dentro dos filhos.

        System.out.println("----------------------------------------------");

        // Caso a gente queira filtrar:
        // Existe uma sobrecarga desse método que recebe um FileFilter que é interface do pacote java.io
        // que é uma interface funcional que recebe um File como argumento e retorna um boolean
        File[] arquivosFiltrados = pasta.listFiles(File::isFile);

        if (arquivosFiltrados != null) {
            System.out.println("Arquivos:");
            for (File arquivo : arquivosFiltrados) {
                System.out.println(arquivo);
            }
        }

        File[] diretoriosFiltrados = pasta.listFiles(File::isDirectory);

        if (diretoriosFiltrados != null) {
            System.out.println("Diretórios:");
            for (File diretorio : diretoriosFiltrados) {
                System.out.println(diretorio);
            }
        }

        System.out.println("----------------------------------------");

        // Existe outra sobrecarga que recebe uma interface funcional chamada FilenameFilter
        // Recebe como argumento um File e um String name
        // Tanto arquivos quanto diretórios.
        File[] arquivosFiltradosPeloNome = pasta.listFiles((dir, name) -> name.startsWith("a"));

        if (arquivosFiltradosPeloNome != null) {
            System.out.println("Arquivos filtrados pela letra A: ");
            for (File file : arquivosFiltradosPeloNome) {
                System.out.println(file);
            }
        }

    }
}
