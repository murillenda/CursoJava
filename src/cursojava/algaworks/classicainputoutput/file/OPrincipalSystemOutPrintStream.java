package cursojava.algaworks.classicainputoutput.file;

import java.io.*;

public class OPrincipalSystemOutPrintStream {
    public static void main(String[] args) throws IOException {
        String nome = "Murillo";

        PrintStream printStream = System.out;
        printStream.printf("Olá, %s%n", nome);

        OutputStream out = System.out;
        out.write(nome.getBytes());

        PrintStream outFileStream = new PrintStream(new FileOutputStream(
            new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/arquivo.txt")));
        outFileStream.printf("Olá, %s %n", nome);
    }
}
