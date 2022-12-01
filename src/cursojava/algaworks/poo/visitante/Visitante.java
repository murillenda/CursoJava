package cursojava.algaworks.poo.visitante;

public class Visitante {

    public static final Integer IDADE_MINIMA_ACESSO_IRRESTRITO = 18;

    String nome;
    Integer idade;


    public boolean maiorDeIdade() {
        return idade >= 18;
    }
}
