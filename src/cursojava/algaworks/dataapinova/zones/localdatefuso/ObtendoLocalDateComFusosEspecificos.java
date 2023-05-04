package cursojava.algaworks.dataapinova.zones.localdatefuso;

import java.time.LocalDate;
import java.time.ZoneId;

public class ObtendoLocalDateComFusosEspecificos {
    public static void main(String[] args) {
        // LocalDate para default do meu sistema operacional
        LocalDate dataAtual = LocalDate.now();

        // LocalDate para esse furo horário em específico
        // Ele continua sem armazenar o fuso horário, é apenas a data local para o fuso especificado.
        LocalDate dataJapao = LocalDate.now(ZoneId.of("Japan"));

        System.out.println(dataAtual);
        System.out.println(dataJapao);
    }
}
