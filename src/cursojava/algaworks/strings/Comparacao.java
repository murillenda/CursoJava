package cursojava.algaworks.strings;

public class Comparacao {
    public static void main(String[] args) {

        String nome1 = "João";
        String nome2 = "João";

        System.out.println(nome1 == nome2); //true

        String nome3 = "João";
        String nome4 = new String("João");
        System.out.println(nome3 == nome4); //false

        // Por isso é sempre melhor compararmos strings com o operador equals.
        // Para compararmos o conteúdo e não o ponto de referência.
        System.out.println(nome3.equals(nome4)); // true

    }
}
