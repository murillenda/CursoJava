package cursojava.algaworks.classesabstratas.faturamento.service;

import cursojava.algaworks.classesabstratas.faturamento.model.notafiscal.NotaFiscal;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notasFiscais) {
        System.out.println("-------------------");
        for (NotaFiscal notaFiscal : notasFiscais) {
            notaFiscal.emitir();
            System.out.println("-------------------");
        }
    }

}
