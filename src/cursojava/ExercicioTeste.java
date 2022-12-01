package cursojava;

import java.util.Arrays;

public class ExercicioTeste {
    public static void main(String[] args) {
        metodoExtraido(args);
    }

    private static void metodoExtraido(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("args = " + Arrays.toString(args));
        }
    }
}
