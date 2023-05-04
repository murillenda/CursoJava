package cursojava.algaworks.nio2;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class APrincipalPath {
    public static void main(String[] args) {
        // Precisamos de uma referência a um sistema de arquivos
        // sistemas de arquivos é um componente de software que cuida de como os arquivos são organizados e armazenados
        // em um dispositivo, como por exemplo, no disco rígido
        // então, todo disco rígido tem um sistema de arquivos que diz como é organizado e como é armazenado esses arquivos
        // nesse dispositivo
        // FileSystem é uma classe abstrata que é o sistema de arquivos
        FileSystem fs = FileSystems.getDefault(); // Retorna uma instância do sistema de arquivos padrão
        // na NIO2 para representar um arquivo ou uma pasta, utilizamos Path
        // Representa apenas um CAMINHO de uma arquivo ou diretório no sistema de arquivos.
        Path arquivo1 = fs.getPath("src/cursojava/algaworks/nio2/arquivos/docs/contrato.txt"); // Com o FileSystem conseguimos pegar o Path
        // Modos de instânciar
        Path arquivo2 = fs.getPath("src/cursojava/algaworks/nio2/arquivos", "docs/contrato.txt");
        Path arquivo3 = fs.getPath("src/cursojava/algaworks/nio2/arquivos", "docs", "contrato.txt");
        // Esse método internamente pega o FileSystems.getDefault() e depois o getPath
        // basicamente faz o que fizemos antes com o FileSystem, é um método de conveniencia
        // Só está disponível a partir do Java 11, que foi uma melhoria para facilitar.
        Path arquivo4 = Path.of("src/cursojava/algaworks/nio2/arquivos", "docs", "contrato.txt");

        Path nomeArquivo = arquivo1.getFileName();
        Path pasta = arquivo1.getParent();

        System.out.println(nomeArquivo);
        System.out.println(pasta);

        // Para converter um Path para File
        File arquivo5 = arquivo1.toFile();
        // Para converter de File para Path
        Path arquivo6 = arquivo5.toPath();

        // A classe Path não realiza operações no caminho que ela tem, ela só representa o caminho.
        // As operações basicas de arquivos na NIO2 são realizadas por outra classe que vamos ver mais pra frente
        // Muitos métodos da classe File não lançam exceções e não informam o erro de que está ocorrendo.
        // Isso é visto como erro até de design de quem criou na época
        // O próprio método rename, não é totalmente multiplataforma, ele funciona diferentemente em alguns SO
        // File não tem suporte a links simbólicos, não entende esse tipo de arquivo
        // E também ela não possui uma forma de obter metadados do arquivo, como permissões e proprietário do arquivo
        // então por essa e muitas outras razões, resolveram criar algo totalmente do 0 e mantiveram as duas classes
        // nas apis distintas.
    }
}
