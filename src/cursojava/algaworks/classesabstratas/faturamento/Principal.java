package cursojava.algaworks.classesabstratas.faturamento;

import cursojava.algaworks.classesabstratas.faturamento.model.notafiscal.NotaFiscalProduto;
import cursojava.algaworks.classesabstratas.faturamento.model.notafiscal.NotaFiscalServico;
import cursojava.algaworks.classesabstratas.faturamento.service.GestorFiscal;

public class Principal {
    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

        var nfBolaFutebol = new NotaFiscalProduto("Bola de futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da Roda", 900, false);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);
    }
}
