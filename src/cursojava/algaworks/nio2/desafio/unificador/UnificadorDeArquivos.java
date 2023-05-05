package cursojava.algaworks.nio2.desafio.unificador;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.*;

public final class UnificadorDeArquivos {

    private static final int UM_KILOBYTE = 1024;

    private final Path pastaArquivosFragmentados;
    private final Path pastaDestinoUnificado;
    private final String prefixoArquivosFragmentados;

    public UnificadorDeArquivos(Path pastaArquivosFragmentados, Path pastaDestinoUnificado, String prefixoArquivosFragmentados) {
        Objects.requireNonNull(pastaArquivosFragmentados);
        Objects.requireNonNull(pastaDestinoUnificado);
        Objects.requireNonNull(prefixoArquivosFragmentados);

        this.pastaArquivosFragmentados = pastaArquivosFragmentados;
        this.pastaDestinoUnificado = pastaDestinoUnificado;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }

    public void unificar() throws IOException {
        List<Path> arquivosFiltradosPeloNome = filtrarArquivosPeloNome();
        List<Path> listaArquivosOrdenados = ordenarArquivos(arquivosFiltradosPeloNome);
        escreverArquivoUnificado(listaArquivosOrdenados);
    }

    private List<Path> filtrarArquivosPeloNome() throws IOException {

        try (Stream<Path> arquivosStream = Files.list(pastaArquivosFragmentados)) {
            List<Path> listaArquivosFragmentos = arquivosStream.filter(Files::isRegularFile)
                .map(Path::getFileName)
                .map(Path::toString)
                .filter(nome -> nome.matches(String.format(".*%s.\\d+", prefixoArquivosFragmentados)))
                .map(Path::of)
                .toList();

            if (listaArquivosFragmentos.isEmpty()) {
                throw new IOException("Não existem fragmentos com prefixo " + prefixoArquivosFragmentados + " na pasta "
                + pastaArquivosFragmentados.toAbsolutePath());
            }

            return listaArquivosFragmentos;
        }
    }

    private List<Path> ordenarArquivos(List<Path> arquivosFragmentadosFiltrados) {
        Pattern numeroArquivo = Pattern.compile("\\.(\\d+)");

        return arquivosFragmentadosFiltrados.stream()
            .sorted(Comparator.comparing(arquivo -> {
                Matcher matcher = numeroArquivo.matcher(arquivo.getFileName().toString());
                if (matcher.find()) {
                    return Integer.parseInt(matcher.group(1));
                }
                throw new OrdenacaoArquivosException("Erro na ordenação de arquivos fragmentados");
            }))
            .toList();
    }

    private void escreverArquivoUnificado(List<Path> listaArquivosOrdenados) throws IOException {
        try (ByteChannel channelWrite = Files.newByteChannel(pastaDestinoUnificado, CREATE_NEW, WRITE)) {
            for (Path arquivoFragmentado : listaArquivosOrdenados) {
                var arquivoFragmentadoPath = Path.of(pastaArquivosFragmentados.toString(), arquivoFragmentado.toString());
                escreverArquivoFragmento(channelWrite, arquivoFragmentadoPath);
            }
        }
    }

    private void escreverArquivoFragmento(ByteChannel channelWrite, Path arquivoFragmentado) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(UM_KILOBYTE);
        try (ByteChannel channelRead = Files.newByteChannel(arquivoFragmentado, READ)) {
            while (channelRead.read(buffer) > 0) {
                buffer.flip();
                channelWrite.write(buffer);
                buffer.clear();
            }
        }
    }

    @Override
    public String toString() {
        return "UnificadorDeArquivos{" +
            "pastaArquivosFragmentados=" + pastaArquivosFragmentados +
            ", pastaDestinoUnificado=" + pastaDestinoUnificado +
            ", prefixoArquivosFragmentados='" + prefixoArquivosFragmentados + '\'' +
            '}';
    }
}
