package cursojava.algaworks.collections.arraylistcomgenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) { // Não funciona caso o método equals não esteja sobrescrito corretamente
                                        //Sobreescrevemos ele na classe Hotel
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }


    public void removerPorCidade(String cidade) {

        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }

            //Modo para remover com o iterator
        }

        /*
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equalsIgnoreCase(cidade)) {
                hoteis.remove(i);
                i--; // Utilizado pois quando é removido o item, todos os itens da lista andam 1 no índice para ajusta-la
            }
        }
         */

        //ou
        /*
        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equalsIgnoreCase(cidade)) {
                hoteisParaRemocao.add(hotel);
            }
        }
        hoteis.removeAll(hoteisParaRemocao);
         */
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if (!removido) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção");
        }
    }

    public void removerTodos() {
        hoteis.clear(); //remove todos os objetos da sua lista
    }

}
