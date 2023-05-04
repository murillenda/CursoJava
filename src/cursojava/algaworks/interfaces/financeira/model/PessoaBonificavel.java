package cursojava.algaworks.interfaces.financeira.model;

public interface PessoaBonificavel extends ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancada);
}
