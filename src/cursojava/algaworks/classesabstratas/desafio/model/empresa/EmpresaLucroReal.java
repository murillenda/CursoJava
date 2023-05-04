package cursojava.algaworks.classesabstratas.desafio.model.empresa;

import cursojava.algaworks.classesabstratas.desafio.model.pessoa.PessoaJuridica;

public class EmpresaLucroReal extends PessoaJuridica {

    private static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getLucroAnual() * ALIQUOTA_IMPOSTO_LUCRO;
    }
}
