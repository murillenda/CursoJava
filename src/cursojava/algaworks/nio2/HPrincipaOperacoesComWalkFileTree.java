package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class HPrincipaOperacoesComWalkFileTree {
    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/deletar");
        // Primeiro parâmetro a ser passado é o Path do diretório
        // Segundo parâmetro passamos um FileVisitor, que é uma interface com 4 métodos
        // SimpleFileVisitor implementa essa interfaec e já tem uma implementação padrão
        // Então implementamos uma classe anônima
        Files.walkFileTree(pasta, new SimpleFileVisitor<>(){
            // o walkFileTree vai passando nos arquivos, e pra cada arquivo que encontrar, ele vai usar o visitFile
            // esse método retorna um FileVisitResult, que é um enum com 4 constantes
            // ela é usada para controlar o comportamento do walkFileTree
            // dependendo do que retornar nesse método do visitFile, ele irá mudar o comportamento
            // por exemplo, se retornar um CONTINUE, é para continuar visitando os arquivos
            // caso retornar um TERMINATE, pode parar de procurar os arquivos
            // caso retorne um SKIP_SUBTREE, indica que deve pular o processamento dos sub-diretórios, mas deve continuar o do atual
            // e caso retorne SKIP_SIBLINGS, indica que deve pular o processamento dos outros arquivos que são irmãos do arquivo que está sendo processado no momento
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.printf("Excluindo arquivo: %s%n", file);
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }
/*
            // método chamado antes de chamado o diretório
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.printf("Excluindo diretório: %s%n", dir);
                return FileVisitResult.CONTINUE;
            }*/

            // esse método vai ser chamado após a visita de um diretório
            // então para excluir todos os arquivos, temos de utilizar este método
            // já que a pasta vai estar vazia após a visitação
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.printf("Excluindo diretório: %s%n", dir);
                Files.delete(dir);
                return super.postVisitDirectory(dir, exc);
            }
        });
    }
}
