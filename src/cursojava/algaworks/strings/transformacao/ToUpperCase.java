package cursojava.algaworks.strings.transformacao;

public class ToUpperCase {
    public static void main(String[] args) {
        String nome = "Pedro";

        nome.toUpperCase();

        // Retorna Pedro, pois string é imutável
        System.out.println(nome);

        String nomeEmMaiusculo = nome.toUpperCase();
        // Retorna PEDRO, pois atribuimos em uma outra variável
        System.out.println(nomeEmMaiusculo);
    }
}
