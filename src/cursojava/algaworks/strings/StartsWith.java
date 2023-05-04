package cursojava.algaworks.strings;

public class StartsWith {
    public static void main(String[] args) {
        String nome = "João";

        System.out.println(nome.startsWith("J")); // true
        System.out.println(nome.startsWith("Jo")); // true
        System.out.println(nome.startsWith("JO")); // false
    }
}
