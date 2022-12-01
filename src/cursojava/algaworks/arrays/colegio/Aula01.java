package cursojava.algaworks.arrays.colegio;

import java.util.Arrays;
import java.util.Comparator;

public class Aula01 {
    private static final int QUANTIDADE_ALUNOS_TURMA_B = 2 + 1;
    public static void main(String[] args) {
        var turmaB = new Turma();
        turmaB.indentificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        turmaB.alunos = new Aluno[QUANTIDADE_ALUNOS_TURMA_B];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "Murillo";
        turmaB.alunos[0].idade = 22;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 34;

        turmaB.alunos[1] = aluno1;

//        Arrays.stream(turmaB.alunos)
//            .filter(Objects::nonNull)
//            .map(a -> a.nome)
//            .forEach(System.out::println);
    }

    private static boolean numeroPar(int numero) {
        return numero % 2 == 0;
    }

    private static void retornaNumerosParesDeUmArray(Integer[] array) {
        Arrays.stream(array)
            .sorted(Comparator.reverseOrder())
            .filter(Aula01::numeroPar)
            .forEach(System.out::println);
    }
}
