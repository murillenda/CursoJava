package cursojava.algaworks.strings.desafio.resolucaoComPattern;

public class ValidadorEmail {

    public static boolean validar(String email) {
        // Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);
        return email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}");
    }

}
