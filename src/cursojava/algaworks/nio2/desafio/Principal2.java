package cursojava.algaworks.nio2.desafio;

import cursojava.algaworks.nio2.desafio.unificador.UnificadorDeArquivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Principal2 {
    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivos(
                Path.of("src/cursojava/algaworks/nio2/desafio/unificador/arquivos"),
                Path.of("src/cursojava/algaworks/nio2/desafio/unificador/arquivos/testeapiclassica.png"),
                "testeapiclassica.png");
            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }
}
