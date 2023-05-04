package cursojava.algaworks.strings.transformacao;

public class Replace {
    public static void main(String[] args) {
        String nome = "Pedro da Silva da Costa de Oliveira";

        // Substituir todos os A's da string por @
        // Neste exemplo utilizando char
        System.out.println(nome.replace('a', '@'));

        // Substituindo todos os  da  por espaço simples
        // Neste exemplo utilizando string
        System.out.println(nome.replace(" da ", " "));
    }
}
