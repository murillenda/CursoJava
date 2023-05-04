package cursojava.algaworks.collections.arraylistsemgenerics;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 3000);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1300);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        //Acessando hotel por indice usando DownCasting de Object para Hotel
        Hotel hotel = (Hotel) cadastro.obterTodos().get(1);
        System.out.println(hotel.getNome());

        // Iterando em uma ArrayList com for tradicional

        ArrayList hoteis = cadastro.obterTodos();
        // hoteis.add("Teste"); Caso a gente faça isso, iremos tomar ClassCastException quando formos imprimir todos,
        // Pois o DownCasting é feito para (Hotel) e isso é uma String, ou seja, iria dar erro, pqra corrigir isso, uti-
        // lizamos Generics
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = (Hotel) hoteis.get(i); //Assumindo o risco de tomar ClassCastException, pois não estamos usando generics
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
