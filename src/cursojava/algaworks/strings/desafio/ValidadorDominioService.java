package cursojava.algaworks.strings.desafio;

import static cursojava.algaworks.strings.desafio.CaracteresEspeciaisConstants.*;

public class ValidadorDominioService {

    private ValidadorDominioService() {}

    public static boolean validar(String email) {
        boolean dominioValido = false;

        if (existeCarateresDepoisArrobaEAntesPonto(email)) {
            String dominio = getDominio(email);

            ValidacaoPalavras atributosValidacaoUsuario = new ValidacaoPalavras(
                dominio, false, true,
                PONTO, TRACO);

            dominioValido = ValidacaoPalavras.validacaoGeral(atributosValidacaoUsuario, dominio);
        }

        return dominioValido;

    }

    private static boolean existeCarateresDepoisArrobaEAntesPonto(String email) {
        var indiciePonto = IndexUtils.getIndiceCharacterFinal(email, PONTO);
        var posicaoArroba = IndexUtils.getIndiceCharacterComeco(email, ARROBA);
        var existeSufixo = indiciePonto > posicaoArroba;
        return IndexUtils.indicePositivo(indiciePonto) && existeSufixo;
    }

    private static String getDominio(String email) {
        var posicaoPontoSufixo = IndexUtils.getIndiceCharacterFinal(email, PONTO);
        var posicaoArroba = IndexUtils.getIndiceCharacterComeco(email, ARROBA);
        return email.substring(posicaoArroba + 1, posicaoPontoSufixo);
    }
}
