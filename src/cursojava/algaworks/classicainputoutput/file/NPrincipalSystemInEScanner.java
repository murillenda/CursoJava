package cursojava.algaworks.classicainputoutput.file;

import java.io.*;
import java.util.Scanner;

public class NPrincipalSystemInEScanner {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);

        String linha = null;

        while (!(linha = scanner.nextLine()).equals("sair")) {
            System.out.println("Você digitou: " + linha);
        }
*/

        /*

        InputStream inputStream1 = System.in;
        BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream1));

        String linha = null;
        while (!(linha = leitor.readLine()).equals("sair")) {
            System.out.println("Você digitou " + linha);
        }

         */
        Scanner scanner = new Scanner(new FileInputStream("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos/lista.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
