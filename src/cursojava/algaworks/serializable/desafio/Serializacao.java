package cursojava.algaworks.serializable.desafio;

import cursojava.algaworks.serializable.desafio.models.Cliente;
import cursojava.algaworks.serializable.desafio.models.Endereco;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Serializacao {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        Path path = Path.of("src/cursojava/algaworks/serializable/desafio/arquivos/arquivo.ser");

        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path, CREATE, WRITE))) {
            outputStream.writeObject(cliente);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
