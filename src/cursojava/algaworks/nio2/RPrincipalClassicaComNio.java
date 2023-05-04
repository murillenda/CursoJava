package cursojava.algaworks.nio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class RPrincipalClassicaComNio {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda.txt");

        ByteBuffer buffer = ByteBuffer.allocate(5);
        try (var inputStream = new FileInputStream(path.toFile()); // conversão para file
             var channel = inputStream.getChannel()) { // pegando o channel a partir do inputStream
            while(channel.read(buffer) > 0) {
                buffer.flip();
                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
                System.out.print(charBuffer);
                buffer.clear();
            }
        }
    }
}
