package cursojava.algaworks.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PPrincipalLendoArquivoComBuffersMenores {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/cursojava/algaworks/nio2/arquivos/docs/contratos/clientes/contrato-venda.txt");
        ByteBuffer buffer = ByteBuffer.allocate(5);

        // Caso os bytes alocados no ByteBuffer não sejam o suficiente pra ler os dados do arquivo
        // Então precisamos de um loop
        try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            while(channel.read(buffer) > 0) {
                buffer.flip();
                CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
                System.out.print(charBuffer);
                // Precisamos fazer um clear para isso funcionar, pois o ponteiro precisa ir para o início para ler o
                // restante dos dados, já que o decode levou o ponteiro lá pra frente
                buffer.clear();

                // Isso pode ser um problema sim, usar deste modo
                // Imagine que temos um buffer de bytes com esses bytes:
                // 79, 109, -61, -95
                // Esses bytes, quando convertemos para caracteres, eles representam o texto "Olá" em UTF-8
                // o "á" representa 2 bytes se você perceber
                // Imagine que vamos fazer essa leitura, vamos colocar dentro de um buffer com capacidade de 3 bytes
                // Então ele vai ler só os 3 primeiros bytes
                // 79, 109, -61
                // e da segunda vez o -95
                // enão os 3 bytes vão ser decodados tipo: Ol + um caractere maluco, já que o á não é só o byte -61
                // mas sim os dois bytes juntos

                // Ou seja, não é correto ler um Buffer de bytes e converter para um Buffer de caracteres sem levar
                // esse tipo de problema em conta, que alguns caracteres podem ser representados de 2 a 4 bytes
                // e por isso, se lermos um Buffer que vai cortar essa representação no meio, iremos ter problema
                // já que não estamos com toda a representação daquele caractere.
            }
        }
    }
}
