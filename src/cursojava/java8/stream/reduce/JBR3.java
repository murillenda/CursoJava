package cursojava.java8.stream.reduce;

import java.util.Arrays;

public class JBR3 {
    public static void main(String[] args) {
        //UTILIZE APENAS COM FUNÇÕES ASSOCIATIVAS

        var list = Arrays.asList(1, 2, 3, 4, 5, 6);
        String s = "Inscreva-se no canal e compartilhe esse vídeo!";
        String[] split = s.split(" ");
        var listStr = Arrays.asList(split);

        //Funções de Combinação
        //reduce soma
        var soma = list.stream()
                .reduce(0, Integer::sum, Integer::sum);              //reduces com identity
        System.out.println(soma);

        //reduce map + combiner
        var somaMapCombiner = list.stream()
                .reduce(
                        "",
                        (n1, n2) -> n1.concat(n2.toString()),
                        String::concat);              //reduces com identity
        System.out.println(somaMapCombiner);

        //A diferença entre reduce e collect é>
        //REDUCE -> Trabalhar com objetos IMUTÁVEIS
        //COLLECT -> Trabalhar com objetos MUTÁVEIS
    }
}
