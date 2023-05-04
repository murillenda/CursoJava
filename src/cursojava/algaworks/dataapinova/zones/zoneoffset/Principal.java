package cursojava.algaworks.dataapinova.zones.zoneoffset;

import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal {
    public static void main(String[] args) {
        // Instancia um ZoneOffSet
        ZoneId offset1 = ZoneId.of("-03:00"); // O ZoneId no método of, identifica se é um OffSet ou um Region e já instancia
                                                // um objeto da classe correta.

        System.out.println(offset1);
        System.out.println(offset1.getClass());

        // ZoneOffset Não é visibilidade package igual ZoneRegion, esse pode ser instanciado
        ZoneId offset2 = ZoneOffset.UTC; // Z
        System.out.println(offset2); // Z

        ZoneId offset3 = ZoneOffset.of("-03:00"); // Mesma coisa do ZoneId.of
        System.out.println(offset3);

        ZoneId offset4 = ZoneOffset.ofHours(-3);
        System.out.println(offset4); // Também é igual aos outros.
    }
}
