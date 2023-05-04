package cursojava.algaworks.strings.pattern.manipulacaostringsregex;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String html = "joao@algaworks.com";
        // String[] partes = html.split("@"); //Dividindo pelo @
        String[] partes = html.split("[@.]"); //Dividindo por @ e por .
        System.out.println(Arrays.toString(partes));
    }
}
