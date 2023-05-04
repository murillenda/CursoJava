package cursojava.algaworks.strings.boaspraticas;

public class ConcatenacaoLenta {
    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        String texto = "";

        for (int i = 0; i < 200_000; i++) {
            texto = texto + "#";
        }

        System.out.println(texto);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2fs%n", duracao);
    }
}
