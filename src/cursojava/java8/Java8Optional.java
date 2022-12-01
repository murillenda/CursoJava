package cursojava.java8;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Java8Optional {
    public static void main(String[] args) {
        //OPTIONAIS FORAM FEITOS PARA RECEBER RETORNOS DE MÉTODOS
        //!!!!!!NÃO USAR COMO ARGUMENTOSSSSSSSSSSSSSSSSSSS
        String s = "ss";
        //IFPRESENT
        converteEmNumero(s).ifPresent(System.out::println);
        //OR ELSE
        Integer numero = converteEmNumero(s).orElse(2);
        System.out.println("OrElse normal -> " + numero);
        //OR ELSE GET
        Integer numeroComElseGet = converteEmNumero(s).orElseGet(() -> {
            return 2 + 55;//Operação pesada
        });
        //OR ELSE THROW
        Integer numeroThrow = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor Vazio"));

        //OPTION TIPOS PRIMITIVOS
        int numeroPrimitivo = converteEmNumeroTiposPrimitivos(s).orElseThrow(() -> new NullPointerException("Valor Vazio"));

        System.out.println("OrElse normal -> " + numero);
        System.out.println("OrElse get -> " + numeroComElseGet);
        System.out.println("OrElse throw -> " + numeroThrow);
        System.out.println("OrElse throw PRIMITIVO -> " + numeroPrimitivo);

        //OFF
        var findFirst = Stream.of(1, 2, 3)
                .findFirst();
        System.out.println(findFirst.get());

        //PODE SER SUBSTITUIDO POR

        Stream.of(1, 2, 3)
                .findFirst()
                .ifPresent(e -> System.out.println("Valor da Streams melhoradas aqui" + e));

    }

    public static Optional<Integer> converteEmNumero(String numeroStr) {
        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
    //OPTION TIPOS PRIMITIVOS
    public static OptionalInt converteEmNumeroTiposPrimitivos(String numeroStr) {
        try {
            int integer = Integer.parseInt(numeroStr); // Atenção ao int pequenininho, pois ele é primitivo, o grande nao
            return OptionalInt.of(integer);
        } catch (Exception e) {
            return OptionalInt.empty();
        }
    }
}
