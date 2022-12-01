package cursojava.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class RemoveAcentos {
    public static void main(String[] args) {
        System.out.println(removerAcentos("ááádsadasd´dsadás´dsa´das'çççããàáxx~x~x~"));
    }
    //Remove os acentos em letras e cedilhas, acentos sozinhos não são removidos
    public static String removerAcentos(String frase) {
        String normalizer = Normalizer.normalize(frase, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
    }
}
