package utilstrabalho;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerificadorDiferencaLib {
    public static void main(String[] args) {
        String libDes = """

            """;

        String libPrd = """

            """;
        verificarDiferencaEntreLibs(formatarConteudoLibs(libDes), formatarConteudoLibs(libPrd));
    }

    private static List<String> formatarConteudoLibs(String lib) {
        return quebrarStringParaReceberValoresSemEspacamento(removerConteudoVariaveis(lib));
    }

    private static String removerConteudoVariaveis(String lib) {
        return lib.replaceAll("\".*?\"", "");
    }

    private static List<String> quebrarStringParaReceberValoresSemEspacamento(String libDes) {
        return Arrays.stream(libDes.split("\\r?\\n"))
            .filter(linha -> !linha.trim().isEmpty())
            .collect(Collectors.toList());
    }

    private static void verificarDiferencaEntreLibs(List<String> libDes, List<String> libPrd) {
        int diferencaEntreLibs = Math.abs(libDes.size() - libPrd.size());
        System.out.printf("Diferença de valores nas libs: %d%n", diferencaEntreLibs);

        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Tem na lib DES mas não tem na lib PRD: ");
        libDes.stream()
            .filter(elemento -> !libPrd.contains(elemento))
            .forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Tem na lib PRD mas não tem na lib DES: ");
        libPrd.stream()
            .filter(elemento -> !libDes.contains(elemento))
            .forEach(System.out::println);
    }

}
