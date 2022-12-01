package cursojava.apache.executaveis;

import cursojava.apache.Model.Pessoa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BLerArquivo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream entradaArquivo =
                new FileInputStream(new File
                        ("C:\\Users\\Murillo\\IdeaProjects\\" +
                                "Curso Java\\src\\cursojava\\apache\\" +
                                "arquivostxt\\arquivo.txt"));
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

        List<Pessoa> pessoas = new ArrayList<>();

        while(lerArquivo.hasNext()) {

            String linha = lerArquivo.nextLine();
            if (linha != null && !linha.isEmpty()) {
                String[] dados = linha.split("\\;");

                Pessoa pessoa = new Pessoa();
                pessoa.setNome(dados[0]);
                pessoa.setEmail(dados[1]);
                pessoa.setIdade(Integer.parseInt(dados[2]));

                pessoas.add(pessoa);
            }
        }
        for(Pessoa p: pessoas) {
            System.out.println("Pessoa: ");
            System.out.println("    {Pessoa: " + p.getNome() + "\n     " +
                    "Idade: " + p.getIdade() + "\n     " +
                    "E-mail: " + p.getEmail() + "}");
        }
    }
}
