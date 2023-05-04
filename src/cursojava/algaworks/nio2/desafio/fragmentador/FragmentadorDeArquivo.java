package cursojava.algaworks.nio2.desafio.fragmentador;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

import static java.nio.file.StandardOpenOption.*;

public final class FragmentadorDeArquivo {

    private final Path arquivo;
    private final int tamanhoFragmento;

    public FragmentadorDeArquivo(Path arquivo, int tamanhoFragmento) {
        Objects.requireNonNull(arquivo);
        if (tamanhoFragmento < 1) {
            throw new IllegalArgumentException("Tamanho do fragmento deve ser a partir de 1 byte");
        }
        this.arquivo = arquivo;
        this.tamanhoFragmento = tamanhoFragmento;
    }

    public void fragmentar() throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(tamanhoFragmento);
        int contadorNumeroFragmento = 1;

        try (ByteChannel channel = Files.newByteChannel(arquivo, StandardOpenOption.READ)) {
            while (channel.read(buffer) > 0) {
                buffer.flip();
                Path arquivoFragmento = criarArquivoFragmento(contadorNumeroFragmento++);
                escreverFragmento(arquivoFragmento, buffer);
                buffer.clear();
            }
        }
    }

    private Path criarArquivoFragmento(int numeroFragmento) {
        return Path.of(arquivo.toAbsolutePath() + "." + numeroFragmento);
    }

    private void escreverFragmento(Path arquivo, ByteBuffer buffer) throws IOException {
        try (ByteChannel channelFragmentos = Files.newByteChannel(arquivo,
            WRITE, CREATE_NEW)) {
            channelFragmentos.write(buffer);
        }
    }

}
