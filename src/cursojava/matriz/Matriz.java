package cursojava.matriz;

public class Matriz {
    public static void main(String[] args) {

        int[][] nota = new int[3][6];

        nota[0][0] = 1;
        nota[0][1] = 2;
        nota[0][2] = 3;
        nota[0][3] = 4;
        nota[0][4] = 5;
        nota[0][5] = 6;
        nota[1][0] = 7;
        nota[1][1] = 8;
        nota[1][2] = 9;
        nota[1][3] = 10;
        nota[1][4] = 11;
        nota[1][5] = 12;
        nota[2][0] = 13;
        nota[2][1] = 14;
        nota[2][2] = 15;
        nota[2][3] = 16;
        nota[2][4] = 17;
        nota[2][5] = 18;
        //Percorre as linhas
        for (int poslinha = 0; poslinha < nota.length; poslinha++) {
            //Para cada linha percorre as colunas ARRAY
            System.out.println("__");
            for (int poscoluna = 0; poscoluna < nota[poslinha].length; poscoluna++) {
                System.out.println(nota[poslinha][poscoluna]);
            }
        }
    }
}
