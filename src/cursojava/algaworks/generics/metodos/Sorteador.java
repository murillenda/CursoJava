package cursojava.algaworks.generics.metodos;

import java.util.ArrayList;
import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random();

    public static <T, X> T sortear(T[] valoresSorteio, X valor) {
        if (valoresSorteio.length == 0) {
            throw new IllegalArgumentException("Mínimo de 1 objeto requerido");
        }

        T objt = valoresSorteio[0];
        System.out.println(objt.getClass().getTypeName());

        System.out.println("Classe valor: " + valor.getClass().getSimpleName());

        int posicaoSorteada = RANDOM.nextInt(valoresSorteio.length);
        return valoresSorteio[posicaoSorteada];
    }
}
