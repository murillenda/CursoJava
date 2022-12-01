package cursojava.apache.executaveis;

import cursojava.apache.Model.Pessoa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
    public static void main(String[] args) throws IOException {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Murillo");
        pessoa1.setEmail("giikthelol@gmail.com");
        pessoa1.setIdade(22);

        pessoa2.setNome("Murillo2");
        pessoa2.setEmail("sadsads@gmail.com");
        pessoa2.setIdade(23);

        pessoa3.setNome("Murillo3");
        pessoa3.setEmail("fggggggg@gmail.com");
        pessoa3.setIdade(19);

        //Pode vir do banco de dados ou qualquer fonte de dados
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        File arquivo = new File
                ("C:\\Users\\Murillo\\IdeaProjects\\Curso Java\\src\\cursojava\\apache\\arquivostxt\\arquivo.csv");

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        FileWriter escreverNoArquivo = new FileWriter(arquivo);

        for (Pessoa p: pessoas) {
            escreverNoArquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
        }
        escreverNoArquivo.flush();
        escreverNoArquivo.close();

    }
}
