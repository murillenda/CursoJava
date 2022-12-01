package cursojava.splitArray;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {

        String text = "Tamo Junto aqui bem loco";

        String[] valoresArray = text.split(" ");

        System.out.println(Arrays.toString(valoresArray));


        /*Convertendo um Array em uma Lista*/

        List<String> list = Arrays.asList(valoresArray);

        for (String valorString : list) {
            System.out.println(valorString);
        }

        /*Converter uma Lista para um Array*/

        String[] conversaoArray = list.toArray(new String[5]);

        System.out.println(Arrays.toString(conversaoArray));
    }
}
