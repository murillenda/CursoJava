package cursojava.algaworks.construtor.finals;

public class Principal {
    public static void main(String[] args) throws IllegalAccessException {
        FinalAndUUID produto1 = new FinalAndUUID("Picanha 1kg(peça");
        FinalAndUUID produto2 = new FinalAndUUID("Arroz", 35);
        FinalAndUUID produto3 = new FinalAndUUID();

        System.out.println(produto1.nome);
        System.out.println(produto1.codigo);
        System.out.println(produto1.quantidadeEstoque);

        System.out.println("---------");

        System.out.println(produto2.nome);
        System.out.println(produto2.codigo);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println("---------");

        System.out.println(produto3.nome);
        System.out.println(produto3.codigo);
        System.out.println(produto3.quantidadeEstoque);
    }
}
