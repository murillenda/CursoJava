package cursojava.algaworks.collections.arraylistcomgenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        //cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 3000);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 1300);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        // Iterando em uma ArrayList com for tradicional
        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        // hoteis.add("Teste"); Não podemos mais fazer isso, em tempo de compilação da erro, isso ocorre por conta
        // do generics parametrizado de Hotel no ArrayList
        imprimirHoteis(hoteis);

        // Procura o índice do objeto na lista, caso houver, se não existir na lista, ele retorna o índice -1
        int indice = hoteis.indexOf(new Hotel("Vila", "Fortim/CE", 0));
        System.out.println("Índice: " + indice);
        cadastro.removerPorCidade("Fortim/CE");
        imprimirHoteis(hoteis);
        //remover passando objeto
        cadastro.remover(new Hotel("Tivoli Ecoresort", "Praia do Forte/BA", 0));
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                hotel.getCidade(), hotel.getPrecoDiaria());
        }

        /*
        ListIterator<Hotel> hotelListIterator = hoteis.listIterator(); //hoteis.listIterator(hoteis.size()); Para iterar de trás pra frente
        while (hotelListIterator.hasNext()) { // Caso queria iterar de trás pra frente utilizar o hasPrevious()
            Hotel hotel = hotelListIterator.next(); // Caso queira iterar de trás pra frente utilizar o .previous()
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                hotel.getCidade(), hotel.getPrecoDiaria());
        }
*/

        /*
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                hotel.getCidade(), hotel.getPrecoDiaria());

            //Enquanto estamos iterando, não conseguimos alterar coisas na lista, irá dar uma exception chamada
            //ConcurrentModificationException
        }

         */

        // Iterando em uma ArrayList com for tradicional
        /*for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                hotel.getCidade(), hotel.getPrecoDiaria());
         */
    }
}
