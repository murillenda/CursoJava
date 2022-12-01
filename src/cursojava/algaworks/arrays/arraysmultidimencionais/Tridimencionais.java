package cursojava.algaworks.arrays.arraysmultidimencionais;

import java.util.Arrays;

public class Tridimencionais {
    public static void main(String[] args) {
        String[][][] cidades = new String[2][2][2];
        cidades[0][0][0] = "Uberlândia";
        cidades[0][0][1] = "Uberaba";
        cidades[0][1][0] = "xx";
        cidades[0][1][1] = "yy";

        cidades[1][0][0] = "São Paulo";
        cidades[1][0][1] = "Ribeirão Preto";
        cidades[1][1][0] = "hh";
        cidades[1][1][1] = "kk";
        System.out.println(Arrays.deepToString(cidades));

//        [
//        [
//        [Uberlândia, Uberaba], [null, null]
//        ],
//        [
//        [São Paulo, Ribeirão Preto], [null, null]
//        ]
//        ]
    }
}
