package cursojava.datas;

import java.time.LocalDate;
import java.time.Period;

public class IPeriodo {
    public static void main(String[] args) {

        LocalDate dataAntiga = LocalDate.of(2020, 2, 7);

        LocalDate dataNova = LocalDate.of(2021, 7, 4);

        System.out.println("data antiga é maior que data nova " + dataAntiga.isAfter(dataNova));

        System.out.println("data antiga é anterior a data nova " + dataAntiga.isBefore(dataNova));

        System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));

        Period period = Period.between(dataAntiga, dataNova);

        System.out.println("Dias: " + period.getDays());
        System.out.println("Meses: " + period.getMonths());
        System.out.println("Quantos anos: " + period.getYears());
        System.out.println("O período é de : " + period.getYears() + " anos " + period.getMonths() + " meses " + period.getDays() + " dias");
    }
}
