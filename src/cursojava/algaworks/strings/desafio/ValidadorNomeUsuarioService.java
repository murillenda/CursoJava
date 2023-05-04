package cursojava.algaworks.strings.desafio;

import static cursojava.algaworks.strings.desafio.CaracteresEspeciaisConstants.*;

public class ValidadorNomeUsuarioService {
    private static final int INDICE_INICIO_STRING = 0;

    private ValidadorNomeUsuarioService() {}

    public static boolean validar(String email) {
        boolean nomeUsuarioValido = false;

        if (existeCaracteresAntesDoArroba(email)) {
            String nomeUsuario = getNomeUsuario(email);
            ValidacaoPalavras atributosValidacaoUsuario = new ValidacaoPalavras(
                nomeUsuario, true, true,
                PONTO, UNDERLINE, TRACO);

            nomeUsuarioValido = ValidacaoPalavras.validacaoGeral(atributosValidacaoUsuario, nomeUsuario);
        }

        return nomeUsuarioValido;
    }

    private static boolean existeCaracteresAntesDoArroba(String email) {
        return IndexUtils.indicePositivo(IndexUtils.getIndiceCharacterComeco(email, ARROBA));
    }

    private static String getNomeUsuario(String email) {
        var posicaoArroba = IndexUtils.getIndiceCharacterComeco(email, ARROBA);
        return email.substring(INDICE_INICIO_STRING, posicaoArroba);
    }
}
