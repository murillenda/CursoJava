package cursojava.algaworks.heranca.desafio;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.printf(
            "Funcionário: %s%n" +
            "Mês/Ano: %s%n" +
            "Salário: %.2f%n",
            nome, mesAno, valorSalario);
    }
}
