package cursojava.algaworks.dataapislegado;

import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Se passar algo no construtor, é a quantidade de ms que se passaram desde 31 dec 21h 1969
        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));

        hoje.getMonth(); //mes
        hoje.getYear(); //ano
        hoje.getTime(); //ms desde 1970

        long diferencaMillis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMillis);

        double diferencaHoras = diferencaMillis / 1000 / 60 / 60;
        System.out.printf("Diferença em horas: %.2f%n", diferencaHoras);

        System.out.printf("Depois: %b%n", hoje.after(ontem)); // Pergunta se hoje é depois de ontem

        System.out.printf("Depois: %b%n", hoje.before(ontem)); //pergunta se hoje é antes de ontem

        System.out.printf("Depois: %b%n", hoje.compareTo(ontem));


    }
}
