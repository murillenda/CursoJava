package cursojava.java8.lambda.manipulandoCollectionsMaisFacil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MetodosMaisNovos {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //foreach
        list.forEach(System.out::println);
        //remove da lista SE
        list.removeIf(n -> n % 2 == 0);
        list.forEach(System.out::println);
        //substitui tudo da lista pelo n * 2
        list.replaceAll(n -> n * 2);
        list.forEach(System.out::println);

        //Map
        var map = new HashMap<>();
        map.put(0, "Se");
        map.put(1, "Inscreva");
        map.put(2, "No");
        map.put(3, "Canal");
        //ForEachMap
        map.forEach((k, v) -> System.out.println(k.toString() + " " + v.toString()));

        //Compute
        map.compute(1, (k, v) -> v + " agora"); //Caso a key não exista, o value fica null, porém imprime a key igualmente
        map.forEach((k, v) -> System.out.println(k.toString() + " " + v.toString()));

        //merge
        map.merge(3, "!", (v1, v2) -> v1 + v2.toString()); //Caso chave não exista, somente a "!" irá entrar, não fica null
        map.forEach((k, v) -> System.out.println(k.toString() + " " + v.toString()));

        //replaceAll
        map.replaceAll((k, v) -> v + "!");
        map.forEach((k, v) -> System.out.println(k.toString() + " " + v));
    }
}
