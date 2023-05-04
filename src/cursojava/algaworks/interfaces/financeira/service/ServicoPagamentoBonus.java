package cursojava.algaworks.interfaces.financeira.service;

import cursojava.algaworks.interfaces.financeira.model.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada){
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        //aqui teria a implementaçao da lógica de pagamento

        System.out.printf("DEBUG: Bônus pago no valor de %.2f", valorBonus);
    }

}
