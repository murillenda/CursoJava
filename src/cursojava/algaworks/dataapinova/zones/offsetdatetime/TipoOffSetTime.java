package cursojava.algaworks.dataapinova.zones.offsetdatetime;

import java.time.OffsetTime;

public class TipoOffSetTime {
    public static void main(String[] args) {
        // Representa apenas uma Hora com o OffSet, sem a data
        // Internamente tem um LocalTime e um ZoneOffSet
        OffsetTime hora = OffsetTime.now();
        System.out.println(hora);
    }
}
