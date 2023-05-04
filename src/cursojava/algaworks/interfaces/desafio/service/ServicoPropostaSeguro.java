package cursojava.algaworks.interfaces.desafio.service;


import cursojava.algaworks.interfaces.desafio.model.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println("-------------------");
        System.out.println("Proposta de seguro");
        System.out.println("-------------------");

        var valorPremio = bem.calcularValorPremio();

        System.out.printf(bem.descrever());
        System.out.printf("Prêmio: R$%.2f%n", valorPremio);
    }
}
