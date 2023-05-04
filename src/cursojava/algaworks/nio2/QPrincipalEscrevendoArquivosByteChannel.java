package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class QPrincipalEscrevendoArquivosByteChannel {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda-buffer.txt");
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 108);
        byteBuffer.put((byte) -61);
        byteBuffer.put((byte) -95);

        // Caso esse arquivo não exista e a gente queira criar ele ao criar o canal, é só colocar mais um parâmetro
        // chamado CREATE
        // e se caso ele existir e você queira sobrescrever o conteúdo dele, ou seja, quer truncar os dados dele
        // e zerar os dados dele para 0 bytes para começar a substituir esse arquivo de novo, então adicione outra
        // constante chamada TRUNCATE_EXISTING
        try (ByteChannel byteChannel = Files.newByteChannel(path, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
            StandardOpenOption.TRUNCATE_EXISTING)) {
            byteBuffer.flip();
            byteChannel.write(byteBuffer);
        }
    }
}
