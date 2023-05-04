package cursojava.algaworks.classesabstratas.desafio;

import cursojava.algaworks.classesabstratas.desafio.model.empresa.EmpresaLucroReal;
import cursojava.algaworks.classesabstratas.desafio.model.empresa.EmpresaSimples;
import cursojava.algaworks.classesabstratas.desafio.model.pessoa.PessoaFisica;
import cursojava.algaworks.classesabstratas.desafio.service.GestorDeImpostos;

public class Principal {
    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da Silva", 45_500);
        var maria = new PessoaFisica("Maria Souza", 180_000);

        var barDoZe = new EmpresaSimples("Bar do zé", 250_000, 160_000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de Impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }
}
