package cursojava.algaworks.strings;

public class ExtraindoNomeLastIndexOfESubString {
    public static void main(String[] args) {

        String nome = "João Silva Souza";

        // Procura da direita para esquerda
        System.out.println(nome.lastIndexOf(" ")); // 10
        System.out.println(nome.substring(10 + 1)); // Souza

        System.out.println(obterUltimoNome(nome));
    }

    private static String obterUltimoNome(String nome) {
        int posicaoUltimoEspaco = nome.lastIndexOf(" ");

        if (posicaoUltimoEspaco > 0) {
            return nome.substring(posicaoUltimoEspaco + 1);
        }

        throw new RuntimeException("Não é um nome completo");
    }
}
