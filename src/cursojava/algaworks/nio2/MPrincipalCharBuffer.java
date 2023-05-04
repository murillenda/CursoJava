package cursojava.algaworks.nio2;

import java.nio.CharBuffer;
import java.util.Arrays;

public class MPrincipalCharBuffer {
    public static void main(String[] args) {
        // Funciona da mesma forma do ByteByffer
        // mas ao invés de alocar bytes, ele aloca caracteres
        CharBuffer charBuffer = CharBuffer.allocate(1000); // 1000 caracteres o tamanho do buffer
        charBuffer.put("O");
        charBuffer.put("l");
        charBuffer.put("á");
        // System.out.println(Arrays.toString(charBuffer.array()));

        // chars retorna um IntStream
        // precisamos fazer um flip, pois se não ele só mostra os valores para frente do ponteiro, ou seja, onde não
        // tem nada adicionado
        //charBuffer.flip(); // Travamos o limite para ficar onde manuseamos
        //charBuffer.chars() // Precisamos fazer um cast para um char, pois isso retorna um int que representam os chars
        //        .forEach(c -> System.out.print((char) c + " "));

        // após o flip podemos utilizar assim que o resultado é o mesmo
        System.out.println(charBuffer);
    }
}
