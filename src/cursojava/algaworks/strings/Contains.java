package cursojava.algaworks.strings;

public class Contains {
    public static void main(String[] args) {
        String nome = "João da Silva Souza";

        System.out.println(nome.contains("lva")); // true
        System.out.println(nome.contains("Silva")); // true
        System.out.println(nome.contains("SILVA")); // false
    }
}
