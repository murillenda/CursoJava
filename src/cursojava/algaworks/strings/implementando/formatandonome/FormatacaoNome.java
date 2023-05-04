package cursojava.algaworks.strings.implementando.formatandonome;

public class FormatacaoNome {
    public static void main(String[] args) {
        String nome = "     Pedro da Silva da Costa de Oliveira      ";
        // Remover os espaços das arestas, remover as preposições e tornar tudo em maiusculo

        System.out.println(formatarNome(nome, "da", "de", "do"));
    }

    public static String formatarNome(String nome, String... preposicoesParaExclusao) {
        String nomeFormatado = nome.toUpperCase().strip();

        for (String preposicao : preposicoesParaExclusao) {
            nomeFormatado =
                nomeFormatado.replace(" " + preposicao.toUpperCase() + " ", " ");
        }

        return nomeFormatado;
    }
}
