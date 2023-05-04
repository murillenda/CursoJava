package cursojava.algaworks.classicainputoutput.file;

import java.io.File;
import java.io.IOException;

public class BPrincipalAbsolutePathECanonico {
    public static void main(String[] args) throws IOException {
        File arquivo1 = new File("C:\\EstudosJava\\CursoJava\\src\\cursojava\\algaworks\\classicainputoutput\\file\\arquivos", "contrato.txt");
        System.out.println(arquivo1);

        File arquivo2 = new File("arquivos\\contrato.txt");
        System.out.println(arquivo2);

        // getAbsoluteFile retorna uma nova instância de File já com o caminho resolvido
        // getAbsolutPath retorna uma String da mesma coisa
        System.out.println(arquivo2.getAbsoluteFile()); // Então aqui temos o caminho absolut resolvido do arquivo2 com caminho relativo

        // Fica com \\.. no meio, não resolve completamente o caminho final verdadeiro
        File arquivo3 = new File("..\\arquivos\\contrato.txt");
        System.out.println(arquivo3.getAbsoluteFile());
        // e isso é a mesma coisa de voltar um arquivo pra trás voltando antes do CursoJava
        // Isso se chama caminho canônico

        // o método para pegar ele é:
        // Caminho canonico resolvido para o verdadeiro caminho.
        System.out.println(arquivo3.getCanonicalFile());
    }
}
