package cursojava.algaworks.strings;

public class EndsWith {
    public static void main(String[] args) {
        String nome = "João";

        System.out.println(nome.endsWith("o")); // true
        System.out.println(nome.endsWith("ão")); // true
        System.out.println(nome.endsWith("Ão")); // false
    }
}
