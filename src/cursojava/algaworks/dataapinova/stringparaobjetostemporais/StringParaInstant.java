package cursojava.algaworks.dataapinova.stringparaobjetostemporais;

import java.time.Instant;

public class StringParaInstant {
    public static void main(String[] args) {
        // Colocando sempre em ISO-8601
        // Precisamos colocar o deslocamento de horas quando queremos o parse para Instant
        // Nesse primeiro exemplo ele converte o que passarmos para ele para UTC colocando o Z no final, por exemplo
        // O resultado desse primeiro é: 2000-05-28T22:45:20Z
        Instant instanteMenosTres = Instant.parse("2000-05-28T19:45:20-03:00"); // Passando diferença de horas do utc
        Instant instanteZ = Instant.parse("2000-05-28T19:45:20Z"); // Passando Z de zuluTime

        System.out.println(instanteMenosTres);
        System.out.println(instanteZ);
    }
}
