package cursojava.algaworks.lambda.interfacesfuncionais.as4principais;

import java.util.function.Predicate;

public class PredicateFunctional {
    public static void main(String[] args) {
        // Função de afirmação, função de teste
        // Dado algum objeto, ela retorna true or false
        Predicate<String> predicate = str -> str.startsWith("t");
        boolean comecaComT = predicate.test("Thiago");
        System.out.println(comecaComT);
    }
}
