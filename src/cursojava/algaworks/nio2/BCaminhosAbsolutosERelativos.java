package cursojava.algaworks.nio2;

import java.nio.file.Path;

public class BCaminhosAbsolutosERelativos {
    public static void main(String[] args) {
        // Caminho absoluto
        Path arquivoCaminhoAbsoluto = Path.of("C:\\EstudosJava\\CursoJava\\src\\cursojava\\algaworks\\nio2\\arquivos\\contrato.txt");
        // Caminho relativo
        Path arquivoCaminhoRelativo = Path.of("src/cursojava/algaworks/nio2/arquivos/contrato.txt");
        Path arquivoComPontoPonto = Path.of("src/cursojava/algaworks/nio2/../contrato.txt");

        System.out.println(arquivoCaminhoAbsoluto);
        System.out.println(arquivoCaminhoRelativo);
        System.out.println("Transformação de caminho relativo para absoluto: " + arquivoCaminhoRelativo.toAbsolutePath());
        System.out.println("Ver se é absoluto: " + arquivoCaminhoRelativo.isAbsolute());
        System.out.println("Ver se é relativo: " + !arquivoCaminhoRelativo.isAbsolute());

        // quer dizer que ele está dentro de algaworks e não do nio2
        // C:\EstudosJava\CursoJava\src\cursojava\algaworks\nio2\..\contrato.txt
        // é referente a
        // C:\EstudosJava\CursoJava\src\cursojava\algaworks\contrato.txt
        // Quando chamamos o toAbsolutePath ele não recalcula para normalizar
        System.out.println(arquivoComPontoPonto.toAbsolutePath());

        // Para normalizar ele:
        // Assim fica assim -> // C:\EstudosJava\CursoJava\src\cursojava\algaworks\contrato.txt
        System.out.println(arquivoComPontoPonto.toAbsolutePath().normalize());
    }
}
