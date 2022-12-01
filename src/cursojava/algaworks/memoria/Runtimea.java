package cursojava.algaworks.memoria;
public class Runtimea {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x = new byte[500 * 1024 * 1024]; //ocupa 500MB de memória

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));
        System.out.printf("Memória já reservada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));
        System.out.printf("disponível da já reservada já consumida: %s%n"
            , emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Memória usada: %s%n", emMegabytes(memoriaUsada));

        System.out.println("-----");
    }

    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
