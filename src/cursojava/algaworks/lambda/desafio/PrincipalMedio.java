package cursojava.algaworks.lambda.desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PrincipalMedio {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        // TODO remover funcionários inativos
        Predicate<Funcionario> funcionariosInativos = Funcionario::isInativo;
        funcionarios.removeIf(funcionariosInativos);

        // TODO ordenar funcionários pelo valor do salário
        Function<Funcionario, BigDecimal> function = Funcionario::getSalario;
        funcionarios.sort(Comparator.comparing(function));

        // TODO iterar e imprimir funcionários usando o método estático imprimir
        Consumer<Funcionario> consumer = PrincipalMedio::imprimir;
        funcionarios.forEach(consumer);
    }

    private static void imprimir(Funcionario funcionario) {
        // TODO implementar a impressão do nome, salário e impostos (20%)
        System.out.printf("Nome %s - Salário: %s - Impostos: %s%n",
            funcionario.getNome(), funcionario.getSalario(),
            funcionario.getSalario().multiply(new BigDecimal("0.20")));
    }
}
