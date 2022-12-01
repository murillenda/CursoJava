package cursojava.algaworks.arrays.arraysmultidimencionais;

import java.util.Arrays;

public class Multidimencionais {
    public static void main(String[] args) {
        String[][] cidades = new String[3][3];
        cidades[0][0] = "Uberlândia";
        cidades[0][1] = "Uberaba";
        cidades[0][2] = "Belo Horizonte";

        cidades[1][0] = "São Paulo";
        cidades[1][1] = "Ribeirão Preto";
        cidades[1][2] = "Fortaleza";
        System.out.println(Arrays.deepToString(cidades));
    }
}
