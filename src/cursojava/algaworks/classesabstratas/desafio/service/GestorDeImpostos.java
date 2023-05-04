package cursojava.algaworks.classesabstratas.desafio.service;

import cursojava.algaworks.classesabstratas.desafio.model.pessoa.Pessoa;
import lombok.Getter;

@Getter
public class GestorDeImpostos {

    private double valorTotalImpostos = 0;

    public void adicionar(Pessoa pessoa) {
        var valorImpostos = pessoa.calcularImpostos();
        this.valorTotalImpostos += valorImpostos;
        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), valorImpostos);
    }
}
