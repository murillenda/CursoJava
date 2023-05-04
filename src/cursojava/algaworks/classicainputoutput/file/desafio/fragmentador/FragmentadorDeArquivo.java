package cursojava.algaworks.classicainputoutput.file.desafio.fragmentador;

import java.io.*;
import java.util.Objects;

public record FragmentadorDeArquivo(File arquivo, int tamanhoFragmento) {

    public FragmentadorDeArquivo {
        Objects.requireNonNull(arquivo);
        if (tamanhoFragmento < 1) {
            throw new IllegalArgumentException("Tamanho do fragmento deve ser a partir de 1 byte");
        }
    }

    public void fragmentar() throws IOException {
        try (InputStream inputStream = new FileInputStream(arquivo)) {
            int contadorNumeroFragmento = 1;
            byte[] conteudoFragmento = new byte[tamanhoFragmento];
            int quantidadeBytesLidos;

            while ((quantidadeBytesLidos = inputStream.read(conteudoFragmento)) > 0) {
                File arquivoFragmento = new File(arquivo.getAbsolutePath() + "." + contadorNumeroFragmento++);
                escreverFragmento(arquivoFragmento, conteudoFragmento, quantidadeBytesLidos);
            }
        }
        System.out.println(deletarFotoUnificada() ? "Arquivo principal deletado" : "Arquivo principal não foi deletado");
    }

    private boolean deletarFotoUnificada() throws IOException {
        return arquivo.delete();
    }

    private void escreverFragmento(File arquivoFragmento, byte[] conteudo, int quantidadeBytes) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(arquivoFragmento)) {
            outputStream.write(conteudo, 0, quantidadeBytes);
        }
    }
}
