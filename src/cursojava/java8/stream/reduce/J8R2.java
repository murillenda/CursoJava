package cursojava.java8.stream.reduce;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class J8R2 {
    public static void main(String[] args) {
        //UTILIZE APENAS COM FUNÇÕES ASSOCIATIVAS

        var list = Arrays.asList(1, 2, 3, 4, 5, 6);
        String s = "Inscreva-se no canal e compartilhe esse vídeo!";
        String[] split = s.split(" ");
        var listStr = Arrays.asList(split);

        //Valores de Identidade
        //reduce soma
        var soma = list.stream()
                .reduce(0, Integer::sum);              //reduces com identity
        System.out.println(soma);

        //reduce multiplicação
        var mult = list.stream()
                .reduce(1, (n1, n2) -> n1 * n2);
        System.out.println(mult);

        //reduce concat
        var concat = listStr.stream()
                .reduce("", String::concat);
        System.out.println(concat);

        var menorValor = DoubleStream.of(1.5, 1.3, 6.7)
                .reduce(Double.POSITIVE_INFINITY, Math::min);
        System.out.println(menorValor);
    }
}
