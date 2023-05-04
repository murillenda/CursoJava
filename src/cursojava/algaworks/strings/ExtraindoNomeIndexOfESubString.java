package cursojava.algaworks.strings;

public class ExtraindoNomeIndexOfESubString {
    public static void main(String[] args) {
        String nome = "João Silva Souza";

        // Pega o índice do primeiro espaço da string
        System.out.println(nome.indexOf(" ")); // 4
        // Pega o índice do primeiro v da string
        System.out.println(nome.indexOf("v")); // 8

        // Extrai a partir do índice 5, ou seja, depois do espaço
        System.out.println(nome.substring(5)); // Silva Souza

        // Extrai a partir do índice 5 e até o índice 10
        // Ou seja, a partir do primeiro espaço até o segundo espaço
        System.out.println(nome.substring(5, 10)); // Silva

        System.out.println(obterSobrenome(nome));
        System.out.println(obterSegundoNome(nome));
    }

    private static String obterSobrenome(String nome) {
        // Quando não acha o caractere, ele retorna -1
        var posicaoPrimeiroEspaco = nome.indexOf(" ");
        // Validação feita para verificar se é nome completo(achou espaço)
        // Colocando o if em cima, pois na maior parte dos casos provavelmente irá ser
        // Então economizamos memória e temos mais performance
        // Não estava no curso, mas no meu ver isso ta correto.
        if (posicaoPrimeiroEspaco > 0) {
            return nome.substring(posicaoPrimeiroEspaco + 1);
        }
        throw new RuntimeException("Não é um nome completo.");
    }

    private static String obterSegundoNome(String nome) {
        // Quando não acha o caractere, ele retorna -1
        var posicaoPrimeiroEspaco = nome.indexOf(" ");
        var posicaoPrimeiraLetraSobrenome = posicaoPrimeiroEspaco + 1;
        // Pesquisando a partir do primeiro espaço, para achar o próximo espaço.
        var posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiraLetraSobrenome);

        if (posicaoPrimeiroEspaco > 0) {
            return nome.substring(posicaoPrimeiraLetraSobrenome,
                posicaoSegundoEspaco < 0
                    ? nome.length()
                    : posicaoSegundoEspaco);
        }
        throw new RuntimeException("Não é um nome completo.");
    }
}
