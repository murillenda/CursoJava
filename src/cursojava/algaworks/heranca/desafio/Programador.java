package cursojava.algaworks.heranca.desafio;

import lombok.Getter;

@Getter
public class Programador extends Funcionario{

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonusMenorQueZero(valorBonus)) {
            throw new IllegalArgumentException("Valor do bonus precisa ser maior que 0");
        }
        this.valorBonus = valorBonus;
    }

    private boolean valorBonusMenorQueZero(double valorBonus) {
        return valorBonus < 0;
    }

    @Override
    protected final double calcularSalario(int horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + valorBonus;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "nome=" + getNome() +
            ", valorHora=" + getValorHora() +
            ", valorBonus= " + getValorBonus() +
            '}';
    }
}
