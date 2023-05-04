package cursojava.algaworks.strings.boaspraticas;

public class ConcatenacaoRapida {
    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(210_000);

        String texto = "";

        for (int i = 0; i < 200_000; i++) {
            sb.append("#");
        }

        System.out.println(sb);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2fs%n", duracao);
    }
}
