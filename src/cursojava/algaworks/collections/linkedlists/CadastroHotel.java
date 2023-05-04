package cursojava.algaworks.collections.linkedlists;

import java.util.*;

public class CadastroHotel {

    private final List<Hotel> hoteis = new LinkedList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) { // Não funciona caso o método equals não esteja sobrescrito corretamente
                                        //Sobreescrevemos ele na classe Hotel
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }

    public List<Hotel> obterTodos() {
        return hoteis;
    }

    public Hotel[] obterTodosComoArray() {
        // Se passamos um array menor que o da lista, um novo array irá ser instanciado
        // Caso o tamanho do array seja maior que o tamanho da lista, a implementação
        // vai preencher os 5 primeiros e retornar as 5 instância com os últimos 5 null.
        return hoteis.toArray(new Hotel[0]);

        /*
        Hotel[] hoteis2 = new Hotel[hoteis.size()];
        for (int i = 0; i < hoteis.size(); i++) {
            hoteis2[i] = hoteis.get(i);
        }
        return hoteis2;

         */
    }

    public void ordenar() {
        Collections.sort(hoteis); // Para funcionar, precisamos implementar a interface Comparable
    }

    public void ordernarPorPreco() {
        // Collections.sort(hoteis, new PrecoHotelComparator());
        hoteis.sort(new PrecoHotelComparator());
    }
    public void ordernarPorPrecoMaiorProMenor() {
        // Collections.sort(hoteis, new PrecoHotelComparator());
        hoteis.sort(new PrecoHotelComparator().reversed()
            .thenComparing(Comparator.naturalOrder()));
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
