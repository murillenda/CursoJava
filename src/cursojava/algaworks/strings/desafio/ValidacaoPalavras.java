package cursojava.algaworks.strings.desafio;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class ValidacaoPalavras {

    private final String palavra;
    private final boolean permitidoMaiusculas;
    private final boolean aceitaDigitos;
    private final Character[] characters;

    public ValidacaoPalavras(String palavra, boolean permitidoMaiusculas, boolean aceitaDigitos, Character... characters) {
        this.palavra = palavra;
        this.permitidoMaiusculas = permitidoMaiusculas;
        this.aceitaDigitos = aceitaDigitos;
        this.characters = characters;
    }

    public static boolean validacaoGeral(ValidacaoPalavras atributosValidacaoUsuario, String palavra) {
        return ValidacaoPalavras.palavraNaoEstaVazia(palavra)
            && ValidacaoPalavras.palavraNaoTemEspacoNasArestas(palavra)
            && ValidacaoPalavras.validacoesCaracteres(atributosValidacaoUsuario);
    }

    public static boolean validacoesCaracteres(ValidacaoPalavras validacaoPalavras) {
        for (int i = 0; i < validacaoPalavras.getPalavra().length(); i++) {
            if (!validaCaracteresEspeciais(validacaoPalavras, validacaoPalavras.getPalavra().charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean validaCaracteresEspeciais(ValidacaoPalavras validacaoPalavras, Character character) {
        List<Character> caracteresExtras = Arrays.asList(validacaoPalavras.getCharacters());

        return validacoesLetras(character, validacaoPalavras.isPermitidoMaiusculas())
            || validacoesDigitos(character, validacaoPalavras.isAceitaDigitos())
            || caracteresExtras.contains(character);
    }

    private static boolean palavraEstaVazia(String palavra) {
        return palavra.isEmpty();
    }

    public static boolean palavraNaoEstaVazia(String palavra) {
        return !palavraEstaVazia(palavra);
    }

    public static boolean palavraNaoTemEspacoNasArestas(String palavra) {
        return palavra.strip().equals(palavra);
    }

    private static boolean validacoesDigitos(Character character, boolean aceitaDigitos) {
        return aceitaDigitos && Character.isDigit(character);
    }

    private static boolean validacoesLetras(Character character, boolean permitidoMaiusculas) {
        return Character.isLetter(character) && (permitidoMaiusculas || Character.isLowerCase(character));
    }
}
