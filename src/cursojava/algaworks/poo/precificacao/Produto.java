package cursojava.algaworks.poo.precificacao;

public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
     this.precoCusto = precoCusto;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }
}
