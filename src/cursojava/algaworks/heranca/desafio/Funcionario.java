package cursojava.algaworks.heranca.desafio;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        setNome(nome);
        setValorHora(valorHora);
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome do funcionário não pode ser nulo");
        this.nome = nome;
    }

    public void setValorHora(double valorHora) {
        if (valorHoraMenorQueZero(valorHora)) {
            throw new IllegalArgumentException("valorHora não pode ser menor que 0");
        }
        this.valorHora = valorHora;
    }

    private boolean valorHoraMenorQueZero(double valorHora) {
        return valorHora < 0;
    }

    protected double calcularSalario(int horasTrabalhadas) {
        return horasTrabalhadas * getValorHora();
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno) {
        double valorSalario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno, valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "nome=" + nome +
            ", valorHora=" + valorHora +
            '}';
    }
}
