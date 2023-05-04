package cursojava.algaworks.strings.pattern;

import java.util.regex.Pattern;

public class Teste {
    public static void main(String[] args) {
        String email = "aaa@algaworks.com";
        // \\w = numeros, letras e -
        // \\. = um ponto normal
        // + = um ou mais
        // .+ = qualquer coisa uma ou mais vezes
        // \\d = 0-9
        // {2,3} limite de caracteres

        //documentação pattern;
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html
        boolean valido = Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);

        String nome = "\"nome\":Murillo Marques de Oliveira";
        boolean nomeValido = Pattern.matches("\"nome\":[A-Za-z]+[\\s[A-Za-z]]{2,99}+", nome);
        System.out.println(nomeValido);

    }
}
