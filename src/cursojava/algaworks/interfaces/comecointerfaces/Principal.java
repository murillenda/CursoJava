package cursojava.algaworks.interfaces.comecointerfaces;

import cursojava.algaworks.interfaces.comecointerfaces.contaspagar.model.Holerite;
import cursojava.algaworks.interfaces.comecointerfaces.contaspagar.model.OrdemServico;
import cursojava.algaworks.interfaces.comecointerfaces.contaspagar.servico.ServicoContaPagar;
import cursojava.algaworks.interfaces.comecointerfaces.pagamento.Beneficiario;
import cursojava.algaworks.interfaces.comecointerfaces.pagamento.MetodoPagamento;
import cursojava.algaworks.interfaces.comecointerfaces.pagamento.Pix;
import cursojava.algaworks.interfaces.comecointerfaces.pagamento.Transferencia;

public class Principal {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamentoPix = new Pix();
        MetodoPagamento metodoPagamentoTransferencia = new Transferencia();

        ServicoContaPagar servicoContaPagarPorPix = new ServicoContaPagar(metodoPagamentoPix);
        ServicoContaPagar servicoContaPagarPorTransferencia = new ServicoContaPagar(metodoPagamentoTransferencia);

        var funcionario = new Beneficiario("João da Silva", "123213321", "999999");
        var documento = new Holerite(funcionario, 100, 168);

        var fornecedor = new Beneficiario("Consultoria XYZ", "213123", "123213");
        var ordemServico = new OrdemServico(fornecedor, 65_500);

        servicoContaPagarPorPix.pagar(documento);
        servicoContaPagarPorPix.pagar(ordemServico);

        servicoContaPagarPorTransferencia.pagar(documento);
        servicoContaPagarPorTransferencia.pagar(ordemServico);
    }
}
