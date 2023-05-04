package cursojava.algaworks.strings.transformacao;

public class Repeat {
    public static void main(String[] args) {
        String nome = "Pedro";

        // Basicamente repete a quantidade de vezes que você colocar
        System.out.println(nome + nome + nome);
        // A mesma coisa os dois
        System.out.println(nome.repeat(3));
    }
}
