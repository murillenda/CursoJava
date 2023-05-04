package cursojava.algaworks.classicainputoutput.file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

public class EPrincipalObtendoInformacoesArquivosEDiretorios {
    public static void main(String[] args) throws IOException {
        File pasta1 = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos");
        File arquivo1 = new File(pasta1, "contrato.txt").getCanonicalFile();

        // Pegando o nome do arquivo (APENAS O NOME.vvv)
        System.out.printf("Nome: %s%n", arquivo1.getName());

        // Caminho do diretório pai
        System.out.printf("Diretório pai: %s%n", arquivo1.getParent());

        // Saída sem cannonical:
        // Diretório pai: src\cursojava\algaworks\classicainputoutput\file\arquivos\documentos

        // Saída com cannonical:
        // Diretório pai: C:\EstudosJava\CursoJava\src\cursojava\algaworks\classicainputoutput\file\arquivos\documentos


        // Caso ser pasta true, caso não, false
        System.out.printf("Arquivo: %b%n", arquivo1.isFile());

        // Caso ser diretório true, se não, false
        System.out.printf("Pasta: %b%n", arquivo1.isDirectory());

        // Caso arquivo existe true, se não, false
        System.out.printf("Arquivo existe: %b%n", arquivo1.exists());

        // Caso arquivo esteja oculto true, se não false
        System.out.printf("Arquivo Oculto: %b%n", arquivo1.isHidden());

        // Última modificação realizada no arquivo
        // lastModified retorna um long, retorna o número de ms desde 1970
        // Então passamos um instant dele, para visualizar em instant por exemplo
        System.out.printf("Última modificação: %s%n", Instant.ofEpochMilli(arquivo1.lastModified()));

        // Retorna a quantidade de bytes que o arquivo tem
        System.out.printf("Tamanho: %d%n", arquivo1.length());

        // Retorna true caso possa executar o arquivo
        System.out.printf("Pode executar: %b%n", arquivo1.canExecute()); //TODO não sei pq dá true se é um .txt

        // Retorna true caso possa ler o arquivo
        System.out.printf("Pode ler: %b%n", arquivo1.canRead());

        // Retorna true se pode escrever no arquivo
        System.out.printf("Pode escrever: %b%n", arquivo1.canWrite());
    }
}
