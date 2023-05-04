package cursojava.algaworks.classicainputoutput.file;

import java.io.*;

public class JPrincipalLerArquivoCharacterOrientedStream {
    public static void main(String[] args) {
        File arquivoOrigem = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/contrato.txt");
        StringBuilder texto = new StringBuilder();

        try (Reader leitor = new FileReader(arquivoOrigem)) {
            char[] conteudo = new char[1000]; //array de caracteres vai ser lido de 1000 em 1000 caracteres.
            int quantidadeCaracteres;

            while((quantidadeCaracteres = leitor.read(conteudo)) > 0) { // se a quantidade de caracteres for maior que 0, vai ler os caracteres, se não, só sai
                // leitor.read(); // passamos um array de char, cada posição do array vai ser um caractere, e retorna um int que é a quantiade de caracteres que ele leu
                // então se fizermos aqui só o read, sem um loop, ele vai ler no máximo 1000 caracteres.

                texto.append(conteudo, 0, quantidadeCaracteres); // passamos dentro do stringbuilder a posição que queremos começar a adicionar dentro do texto e qual o tamanho
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        System.out.println(texto); // Aqui vai sair o conteúdo do arquivo.
    }
}
