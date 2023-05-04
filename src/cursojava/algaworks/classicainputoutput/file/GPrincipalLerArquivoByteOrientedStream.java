package cursojava.algaworks.classicainputoutput.file;

import java.io.*;

public class GPrincipalLerArquivoByteOrientedStream {
    public static void main(String[] args) {
        File arquivoOrigem = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/contrato.txt");
        InputStream inputStream = null; // Precisamos declarar aqui fora para conseguir ter acesso ao inputStream no
        // bloco finally

        // Fluxo de dados de entrada
        try {
            inputStream = new FileInputStream(arquivoOrigem);
            // Método read retorna um int, que é valor de bytes de uma informação.
            // caso ele retorne o número -1, é quando terminou as coisas pra ler
            // Ele lê byte a byte
            // System.out.println(inputStream.read());
            // caso dê algum problema na hora da leitura do fluxo de entrada de bytes.
            int conteudo;
            while ((conteudo = inputStream.read()) != -1) { // atribuimos o read para conteudo e perguntasmos se é != de -1
                // System.out.println(conteudo); // imprimimos conteúdo para ver o valor de cada byte
                // System.out.println((char) conteudo); // caso a gente queira transformar em char os bytes, convertemos
                System.out.print((char) conteudo); // Utilizamos com o print apenas, para não pular linhas e vir tudo normal
                // Porém desse modo se a gente colocar alguns caracteres especiais em específico como áçíú
                // eles irão vir diferentes
                // pois existe uma codificação de caracteres chamados UTF-8
                // eles podem ter dois ou mais bytes, até 4 bytes.
                // um caractere comum, como a letra A, só tem 1 byte
                // então quando fazemos um read de um byte, converte normalmente para a letra A
                // Agora no ú por exemplo, tem 2 a 4 bytes
                // Então no byte a byte buga, pois convertemos um byte somente para char, então precisamos converter
                // dois ou quatro bytes em um caractere e nao somente um byte.
                // Por isso que Byte-oriented streams é para ser utilizado somente para ler arquivos binários e não
                // arquivos texto.
            }
            // Como ele lê cada vez que passa no read um byte, então precisamos de um loop para ler todos os bytes.
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        } finally {
            // Sempre que abrimos uma entrada ou uma saída, precisamos fechar ele.
            if (inputStream != null) { // Se cair no catch, inputStream ainda estará nulo, então e´importante a validação
                try {
                    // Fechamos o fluxo
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Não foi possível fechar fluxo com arquivo");
                }
            }
        }
    }
}
