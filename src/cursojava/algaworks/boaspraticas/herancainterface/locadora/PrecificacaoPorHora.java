package cursojava.algaworks.boaspraticas.herancainterface.locadora;

public class PrecificacaoPorHora implements Precificacao {

    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        return notebook.getPrecoPorHora() * horasUtilizadas;
    }
}
