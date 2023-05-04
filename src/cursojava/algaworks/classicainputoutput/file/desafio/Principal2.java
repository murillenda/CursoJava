package cursojava.algaworks.classicainputoutput.file.desafio;

import cursojava.algaworks.classicainputoutput.file.desafio.unificador.UnificadorDeArquivos;

import java.io.File;
import java.io.IOException;

public class Principal2 {
    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivos(
                new File("src/cursojava/algaworks/classicainputoutput/file/desafio/unificador/arquivos"),
                new File("src/cursojava/algaworks/classicainputoutput/file/desafio/unificador/arquivos/testeapiclassica.png"),
                "testeapiclassica.png");
            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }
}
