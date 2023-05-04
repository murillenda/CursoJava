package cursojava.algaworks.dataapinova.zones.zoneregion;

import java.time.ZoneId;

public class Principal {
    public static void main(String[] args) {
        // Obtemos uma instância de ZoneRegion
        ZoneId zona1 = ZoneId.systemDefault(); // Pega o fuso horário padrão do sistema operacional

        System.out.println(zona1); // America/Sao_Paulo
        System.out.println(zona1.getClass()); // ZoneRegion

        ZoneId zona2 = ZoneId.of("America/Los_Angeles");

        System.out.println(zona2);
        System.out.println(zona2.getClass());

        System.out.println("-------");

        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneId); // Mostra uma lista com TODOS os ZoneId's
        }
    }
}
