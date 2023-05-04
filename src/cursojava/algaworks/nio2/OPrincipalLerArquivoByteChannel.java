package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OPrincipalLerArquivoByteChannel {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda.txt");
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // Para leitura de dados de uma origem existe um conceito na NIO chamada de Channels
        // Channels é um mecanismo para realizar operações de I/O
        // newByteChannel recebe
        // 1° parâmetro: path
        // 2° parâmetro opcional: opções de abertura desse arquivo, ex: só leitura, gravação...
        // nesse exemplo vai ser só para leitura
        try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            // Com a api de NIO os dados são lidos do channel em blocos, e esses blocos são os Buffers
            // esse método do channel, lê os dados e joga para dentro do buffer do ByteBuffer
            channel.read(buffer);
            buffer.flip();
            CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
            System.out.println(charBuffer);
        }
    }
}
