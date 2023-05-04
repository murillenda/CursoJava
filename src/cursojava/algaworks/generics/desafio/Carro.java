package cursojava.algaworks.generics.desafio;

public class Carro implements Estocavel {

    private String modelo;
    private int quatidadeEstoque;

    public Carro(String modelo, int quatidadeEstoque) {
        this.modelo = modelo;
        this.quatidadeEstoque = quatidadeEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuatidadeEstoque(int quatidadeEstoque) {
        this.quatidadeEstoque = quatidadeEstoque;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quatidadeEstoque;
    }
}
