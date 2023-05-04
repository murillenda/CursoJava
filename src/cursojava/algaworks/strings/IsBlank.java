package cursojava.algaworks.strings;

public class IsBlank {
    public static void main(String[] args) {
        String nome1 = "      ";

        System.out.println(nome1.isEmpty()); // Retorna false
        System.out.println(nome1.isBlank()); // Retorna true
    }
}

