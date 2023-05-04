package cursojava.algaworks.nio2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class NPrincipalByteBufferParaCharBuffer {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.put((byte) 79); // Letra O
        buffer.put((byte) 108); // Letra l
        // Letra á
        buffer.put((byte) -61);
        buffer.put((byte) -95);
        buffer.flip();

        // Somente assim, não retorna em UTF-8
        // CharBuffer charBuffer = buffer.asCharBuffer();

        // Assim ele decodifica com UTF-8 usando o Charset StandardCharsets UTF_8
        CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
        System.out.println(charBuffer);

        // ver os bytes dessa palavra em utf-8
        System.out.println(Arrays.toString("Olá".getBytes(StandardCharsets.UTF_8)));
    }
}
