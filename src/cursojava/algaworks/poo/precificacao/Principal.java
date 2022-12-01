package cursojava.algaworks.poo.precificacao;

public class Principal {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(80);

        ServidoDePrecificacao servidoDePrecificacao = new ServidoDePrecificacao();
        servidoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de venda: %.2f%n", novoProduto.precoVenda);
        System.out.printf("Preço de custo: %.2f%n", novoProduto.precoCusto);
    }
}
