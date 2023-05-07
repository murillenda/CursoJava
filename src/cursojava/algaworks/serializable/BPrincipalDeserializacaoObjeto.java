package cursojava.algaworks.serializable;

import cursojava.algaworks.serializable.model.Funcionario;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.READ;

public class BPrincipalDeserializacaoObjeto {
    public static void main(String[] args) {
        Path path = Path.of("src/cursojava/algaworks/serializable/arquivos/joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            // Lembrando que precisamos ter certeza que o objeto vindo é um Funcionario para fazer o cast
            // e não ocorrer exceção
            Funcionario funcionario = (Funcionario) inputStream.readObject();
            System.out.println(funcionario);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
