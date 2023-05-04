package cursojava.algaworks.collections.linkedlists;

public class PrincipalTestCompareTo {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Vila Selvagem", "Fortim/CE", 1500);
        Hotel hotel2 = new Hotel("Vila Selvagem", "Fortim/CE", 1500);

        System.out.println(hotel1.compareTo(hotel2));
        // Retorna 1 se o preço diária do hotel 1 for maior que o de hotel 2
        // Retorna -1 se o preço diária do hotel 1 for menor que o de hotel 2
        // Retorna 0 se o preço for igual
    }
}
