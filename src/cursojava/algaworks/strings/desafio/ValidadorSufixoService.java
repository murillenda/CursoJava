package cursojava.algaworks.strings.desafio;

import static cursojava.algaworks.strings.desafio.CaracteresEspeciaisConstants.*;

public class ValidadorSufixoService {

    public static boolean validar(String email) {
        boolean sufixoValido = false;

        if (tamanhoSufixoValido(email)) {
            String sufixo = getSufixo(email);
            ValidacaoPalavras atributosValidacaoUsuario = new ValidacaoPalavras(
                sufixo, false, false);

            sufixoValido = ValidacaoPalavras.validacaoGeral(atributosValidacaoUsuario, sufixo);
        }

        return sufixoValido;
    }

    private static boolean tamanhoSufixoValido(String email) {
        var tamanhoEmail = email.length();
        var indicePonto = IndexUtils.getIndiceCharacterFinal(email, PONTO);
        var tamanhoSufixo = tamanhoEmail - (indicePonto + 1);
        if (IndexUtils.indicePositivo(indicePonto)) {
            return tamanhoSufixo == 2 || tamanhoSufixo == 3;
        }
        return false;
    }

    private static String getSufixo(String email) {
        var tamanhoEmail = email.length();
        var indicePonto = IndexUtils.getIndiceCharacterFinal(email, PONTO);
        return email.substring(indicePonto + 1, tamanhoEmail);
    }
}
