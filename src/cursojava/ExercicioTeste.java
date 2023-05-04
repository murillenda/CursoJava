package cursojava;

public class ExercicioTeste {
    public static void main(String[] args) {
        System.out.printf("Hora em millisegundos = %d%n", sumNums(4));
    }

    private static long sumNums(long num) {
        var soma = 0;
        for (long l = num; l >= 0; l--) {
            soma += l;
        }
        return soma;
    }
}
