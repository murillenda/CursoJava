package cursojava.algaworks.interfaces.comecointerfaces.contaspagar.servico;

import cursojava.algaworks.interfaces.comecointerfaces.pagamento.DocumentoPagavel;
import cursojava.algaworks.interfaces.comecointerfaces.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {

        // Poderia ter outras regras de negócio aqui
        // Como por exemplo registar o pagamento no banco de dados
        // Enviar uma notificação por e-mail, etc

        metodoPagamento.pagar(documento);
    }
}
