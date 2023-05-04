package cursojava.algaworks.classicainputoutput.file.desafio;

import cursojava.algaworks.classicainputoutput.file.desafio.fragmentador.FragmentadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Principal1 {
    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(new File(
                "src/cursojava/algaworks/classicainputoutput/file/desafio/fragmentador/arquivos/testeapiclassica.png"),
                1024 * 50);
            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro na fragmentação arquivo");
            e.printStackTrace();
        }
    }
}
