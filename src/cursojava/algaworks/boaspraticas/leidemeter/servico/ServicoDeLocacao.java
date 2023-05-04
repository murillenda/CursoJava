package cursojava.algaworks.boaspraticas.leidemeter.servico;

import cursojava.algaworks.boaspraticas.leidemeter.Locacao;

public class ServicoDeLocacao {
    public void confirmarLocacao(Locacao locacao) {
        double totalDiarias = locacao.calcularTotalDiarias();

        // TODO realiza lógica para registrar locação pelo valor das diárias

        locacao.reservarVeiculo();
    }
}
