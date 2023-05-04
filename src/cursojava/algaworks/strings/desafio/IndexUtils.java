package cursojava.algaworks.strings.desafio;

public class IndexUtils {
    private IndexUtils() {}

    public static int getIndiceCharacterComeco(String palavra, Character character) {
        return palavra.indexOf(character);
    }

    public static int getIndiceCharacterFinal(String palavra, Character character) {
        return palavra.lastIndexOf(character);
    }

    public static boolean indicePositivo(int indice) {
        return indice > 0;
    }
}
