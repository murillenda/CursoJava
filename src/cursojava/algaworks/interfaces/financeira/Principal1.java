package cursojava.algaworks.interfaces.financeira;

import cursojava.algaworks.interfaces.financeira.model.Fazenda;
import cursojava.algaworks.interfaces.financeira.model.Funcionario;
import cursojava.algaworks.interfaces.financeira.model.Industria;
import cursojava.algaworks.interfaces.financeira.model.ParceiroFinanceiro;
import cursojava.algaworks.interfaces.financeira.service.ServicoFinanciamento;

public class Principal1 {

    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("CapitalABC", 2_000_000);
        var funcionario = new Funcionario("João", 18_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
//        servicoFinanciamento.solicitarFinanciamento(industria, 600_000);
    }
}
