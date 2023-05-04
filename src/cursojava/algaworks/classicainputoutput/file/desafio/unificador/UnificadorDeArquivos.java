package cursojava.algaworks.classicainputoutput.file.desafio.unificador;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UnificadorDeArquivos {

    private static final int UM_KILOBYTE = 1024;

    private final File pastaArquivosFragmentados;
    private final File pastaDestinoUnificado;
    private final String prefixoArquivosFragmentados;

    public UnificadorDeArquivos(File pastaArquivosFragmentados, File pastaDestinoUnificado, String prefixoArquivosFragmentados) {
        Objects.requireNonNull(pastaArquivosFragmentados);
        Objects.requireNonNull(pastaDestinoUnificado);
        Objects.requireNonNull(prefixoArquivosFragmentados);
        this.pastaArquivosFragmentados = pastaArquivosFragmentados;
        this.pastaDestinoUnificado = pastaDestinoUnificado;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }

    public void unificar() throws IOException {
        File[] arquivosFiltradosPeloNome = filtrarArquivosPeloNome();
        List<File> listaArquivosOrdenados = ordenarArquivos(arquivosFiltradosPeloNome);
        escreverArquivoUnificado(listaArquivosOrdenados);
    }

    private File[] filtrarArquivosPeloNome() {
        return pastaArquivosFragmentados.listFiles((dir, name) -> name.startsWith(prefixoArquivosFragmentados + "."));
    }

    private List<File> ordenarArquivos(File[] arquivosFragmentadosFiltrados) {
        Pattern numeroArquivo = Pattern.compile("\\.(\\d+)");

        return Arrays.stream(arquivosFragmentadosFiltrados)
            .sorted(Comparator.comparing(arquivo -> {
                Matcher matcher = numeroArquivo.matcher(arquivo.getName());
                if (matcher.find()) {
                    return Integer.parseInt(matcher.group(1));
                }
                throw new OrdenacaoArquivosException("Erro na ordenação de arquivos fragmentados");
            }))
            .toList();
    }

    private void escreverArquivoUnificado(List<File> listaArquivosOrdenados) throws IOException {
        if (listaArquivosOrdenados.isEmpty()) {
            throw new IOException(String.format("Não existem fragmentos com prefixo %s na pasta %s",
                prefixoArquivosFragmentados, pastaArquivosFragmentados.getAbsolutePath()));
        }

        File arquivoUnificado = new File(pastaDestinoUnificado.getAbsolutePath());

        try (OutputStream outputStream = new FileOutputStream(arquivoUnificado)) {
            for (File arquivoFragmentado : listaArquivosOrdenados) {
                escreverFragmentoArquivo(arquivoFragmentado, outputStream);
            }
        }
    }

    private void escreverFragmentoArquivo(File arquivoFragmentado, OutputStream outputStream) throws IOException {
        try (InputStream inputStream = new FileInputStream(arquivoFragmentado)) {

            byte[] conteudoFragmento = new byte[UM_KILOBYTE];
            int quantidadesBytesLidos;

            while ((quantidadesBytesLidos = inputStream.read(conteudoFragmento)) > 0) {
                outputStream.write(conteudoFragmento, 0, quantidadesBytesLidos);
            }
        }
    }

}
