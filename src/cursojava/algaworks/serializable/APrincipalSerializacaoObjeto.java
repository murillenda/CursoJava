package cursojava.algaworks.serializable;

import cursojava.algaworks.serializable.model.Funcionario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class APrincipalSerializacaoObjeto {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
            "João",
            LocalDate.of(2005, Month.MARCH, 2),
            new BigDecimal("25000"));

        System.out.println(funcionario);

        // Para serializar para um arquivo, precisamos de um Path para informar o caminho que queremos deixar esse arquivo
        // Não existe uma extensão padrão para objetos serializados, mas aqui vamos utilizar .ser
        Path path = Path.of("src/cursojava/algaworks/serializable/arquivos/joao.ser");

        // Para serializar em java, utilizamos uma implementação de OutputStream conhecida como new ObjectOutputStream, sim usando a api clássica de i.o
        // ObjectOutputStream recebe um OutputStream, pra onde queremos jogar esse fluxo de bytes? Para um arquivo, então instanciamos um FileOutputStream

        /*
        Com a api classica:

        try (var outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            outputStream.writeObject(funcionario); // writeObject é da classe ObjectOutputStream que recebe um objeto qualquer que implementa Serializable
            // Caso a classe funcionario neste exemplo não for serializable, ocore um NotSerializableException
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */


        // Com a api clasica + nio usando a implementação da nio do newOuputStream:
        try (var outputStream = new ObjectOutputStream(Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario); // writeObject é da classe ObjectOutputStream que recebe um objeto qualquer que implementa Serializable
            // Caso a classe funcionario neste exemplo não for serializable, ocore um NotSerializableException
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
