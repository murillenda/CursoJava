package cursojava.algaworks.trabalhandocomnumeros.matematica;

public class Min {
    public static void main(String[] args) {
        int x = 100;
        int y = 100;

        // Retorna o Menor Valor
        // int z = Math.min(x, y);
        // or
        int valorMinimo = Integer.min(x, y); // a partir do java 8

        System.out.println(valorMinimo);
    }
}
