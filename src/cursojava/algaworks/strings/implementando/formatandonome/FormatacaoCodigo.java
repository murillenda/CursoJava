package cursojava.algaworks.strings.implementando.formatandonome;

public class FormatacaoCodigo {
    public static void main(String[] args) {
        int codigo = -1;
        //Sempre ter 10 caracteres, caso não bata, preencher com 0 a esquerda

        String codigoFormatado = preencherEsquerda(
            String.valueOf(codigo), '0', 10);
        System.out.println(codigoFormatado);
    }

    private static String preencherEsquerda(String texto, char character, int tamanhoTotal) {
        if (texto.length() < tamanhoTotal) {
            return String.valueOf(character)
                .repeat(tamanhoTotal - texto.length()) + texto;
        }

        return texto;
    }
}
