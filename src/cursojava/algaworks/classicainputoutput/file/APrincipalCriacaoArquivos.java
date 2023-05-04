package cursojava.algaworks.classicainputoutput.file;

import java.io.File;
import java.io.IOException;

public class APrincipalCriacaoArquivos {
    public static void main(String[] args) throws IOException {
        // Representando a referenciação a um caminho para o File
        File pasta1 = new File("C:\\EstudosJava\\CursoJava\\src\\cursojava\\algaworks\\classicainputoutput\\file\\arquivos\\docs");

        // Operação para criar uma pasta
        // Método mkdir (Make Directory) cria uma pasta e retorna um booleano
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());

        // Caso queria criar mais de uma pasta precisa utilizar este outro método
        File pasta2 = new File("C:\\EstudosJava\\CursoJava\\src\\cursojava\\algaworks\\classicainputoutput\\file\\arquivos\\fotos\\viagens");
        System.out.printf("Pasta 1 criada: %b%n", pasta2.mkdirs());

        // Instanciando arquivo
        File arquivo1 = new File("C:\\EstudosJava\\CursoJava\\src\\cursojava\\algaworks\\classicainputoutput\\file\\arquivos\\contrato.txt");
        // Sobrecarga do construtor, 1° parâmetro o pai
        // e no segundo o filho, desse modo:
        // E ele junta os dois
        // Esses dois são a mesma coisa, somente uma forma diferente
        File arquivo2 = new File("C:\\EstudosJava\\CursoJava\\src\\cursojava\\algaworks\\classicainputoutput\\file\\arquivos", "contrato.txt");

        // Também podemos passar a pasta pai e depois o filho:
        // Usando a instância de pasta que usamos anteriormente e agregando ao filho.
        File arquivo3 = new File(pasta1, "europa.txt");

        // Criamos o arquivo assim
        System.out.printf("Arquivo 3 criado: %b%n", arquivo3.createNewFile());
    }
}
