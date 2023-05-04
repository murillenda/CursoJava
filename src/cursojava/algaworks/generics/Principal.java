package cursojava.algaworks.generics;

import cursojava.algaworks.generics.metodos.Sorteador;


public class Principal {
    public static void main(String[] args) {
        String nomes[] = {"Murillo", "Mirella", "Joao"};
        int x = 4;

        var sorteio = Sorteador.sortear(nomes, x);

        System.out.println(sorteio);
    }
}
