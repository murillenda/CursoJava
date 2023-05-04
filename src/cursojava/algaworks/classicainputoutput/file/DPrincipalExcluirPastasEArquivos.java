package cursojava.algaworks.classicainputoutput.file;

import java.io.File;
import java.io.IOException;

public class DPrincipalExcluirPastasEArquivos {
    public static void main(String[] args) throws IOException {
        File pasta2 = new File("C:\\EstudosJava\\CursoJava\\src\\cursojava\\algaworks\\classicainputoutput\\file\\arquivos\\documentos");
        File arquivo1 = new File(pasta2, "contrato.txt");

        // Tentando deletar a pasta 2, que também retorna um boolean
        // Não consegue deletar pastas com algo dentro, só pastas vazias
        System.out.println(arquivo1.delete());
    }
}
