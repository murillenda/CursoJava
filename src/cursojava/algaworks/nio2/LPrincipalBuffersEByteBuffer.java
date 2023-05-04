package cursojava.algaworks.nio2;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class LPrincipalBuffersEByteBuffer {
    public static void main(String[] args) {
        // Representa um buffer de 1kb
        // Então imagine que temos 1024 espaços dentro desse Buffer, onde cada espaço desse comporta 1 byte
        // logo temos o 1kb
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // Assim, podemos ver os 1024 espaços dentro do ByteBuffer
        //System.out.println(Arrays.toString(buffer.array()));


        // ------------- Position -------------
        // Assim podemos ver qual a posição atual que o buffer está marcando
        // É como se fosse um ponteiro
        // A medida que a gente vai adicionando bytes nesse Buffer, essa posição vai se movendo pra frente
        System.out.println(buffer.position());
        buffer.put((byte) 10); // Adicionando número 10 ao buffer, depois daqui o position aponta para próxima posição do array
        System.out.println(buffer.position());
        buffer.flip(); // Volta o ponteiro para a posição 0
        System.out.println(buffer.position());
        buffer.put((byte) 30); // Aqui vamos adicionar na posição 0, pois o ponteiro voltou para a posição 0

        System.out.println(Arrays.toString(buffer.array()));

        // ----------- Limit -------------

        // Mostra qual o limite de posições que podemos alocar no buffer
        // porém, depois que fazemos um flip, o limite é alterado.
        // pois quando chamamos o flip, ele também altera o limite de elementos para posição atual no momento que o método foi chamado
        // ou seja, se estava na posição 1, o limite vai ser 1
        System.out.println(buffer.limit());
        // Ou seja, se tentarmos fazer outro put aqui, ele não vai deixar e vai retornar um BufferOverflowException

        // Se quisermos além de resetar a posição pra 0, mas também voltar o limite de elementos para o tamanho
        // da capacidade do buffer, nos chamamos o clear ao invés do flip.
        buffer.clear();
        System.out.println(Arrays.toString(buffer.array()));
        System.out.println(buffer.limit());
    }
}
