package cursojava.algaworks.strings.transformacao;

public class Strip {
    public static void main(String[] args) {
        String nome = "\n      Pedro      ";

        System.out.println(">" + nome + "<");

        // Remove todos o conteúdo que é espaço e quebra de linha das arestas
        // Existe desde o java 11
        System.out.println("->" + nome.strip() + "<-");

        // Caso esteja usando java mais antigo
        System.out.println(nome.trim());
        // Em alguns espaços com codificação um pouco diferente, que não funciona
        // Prefira usar o Strip que é mais novo...

        // Variações do Strip
        // Remover espaços só da esquerda
        System.out.println(nome.stripLeading());

        // Remove os espaços só da direita
        System.out.println(nome.stripTrailing());
    }
}
