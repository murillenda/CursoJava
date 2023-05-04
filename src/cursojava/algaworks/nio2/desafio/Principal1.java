package cursojava.algaworks.nio2.desafio;


import cursojava.algaworks.nio2.desafio.fragmentador.FragmentadorDeArquivo;

import java.io.IOException;
import java.nio.file.Path;

public class Principal1 {
    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(Path.of(
                "src/cursojava/algaworks/nio2/desafio/fragmentador/arquivos/testeapiclassica.png"),
                1024 * 50);
            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro na fragmentação arquivo");
            e.printStackTrace();
        }
    }
}
