package cursojava.algaworks.strings.desafio;

public class ValidadorEmail {

    public static boolean validar(String email) {
        if (!ValidadorNomeUsuarioService.validar(email)) return false;
        if (!ValidadorDominioService.validar(email)) return false;
        return ValidadorSufixoService.validar(email);
    }

}
