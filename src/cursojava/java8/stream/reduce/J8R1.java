package cursojava.java8.stream.reduce;

import java.util.Arrays;
import java.util.Set;

public class J8R1 {
    public static void main(String[] args) {
        //UTILIZE APENAS COM FUNÇÕES ASSOCIATIVAS

        var list = Arrays.asList(1, 2, 3, 4, 5, 6);
        String s = "Inscreva-se no canal e compartilhe esse vídeo!";
        String[] split = s.split(" ");
        var listStr = Arrays.asList(split);

        //reduce soma
        var soma = list.stream()
                .reduce(Integer::sum);
        System.out.println(soma.get());

        //reduce multiplicação
        var mult = list.stream()
                .reduce((n1, n2) -> n1 * n2);
        System.out.println(mult.get());

        //reduce concat
        var concat = listStr.stream()
                .reduce(String::concat);
        System.out.println(concat);
    }

    private Double calculaMediaProdutos(Set<Integer> listaValores) {
        return listaValores.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }
}
