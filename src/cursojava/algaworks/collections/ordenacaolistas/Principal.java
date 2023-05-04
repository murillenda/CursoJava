package cursojava.algaworks.collections.ordenacaolistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(1);
        numeros.add(6);

        // Collections = classe utilitária com vários métodos
        // Collection = interface que conhecemos...
        Collections.sort(numeros); // não retorna um novo objeto, ele ordena a própria lista existente.
        Collections.sort(numeros, Comparator.reverseOrder());

        System.out.println(numeros);
    }
}
