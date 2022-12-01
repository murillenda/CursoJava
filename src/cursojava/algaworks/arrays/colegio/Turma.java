package cursojava.algaworks.arrays.colegio;

import java.util.Arrays;
import java.util.Objects;

public class Turma {
    String indentificacao;
    String nomeProfessora;
    Aluno[] alunos = new Aluno[0];

    void adicionarAluno(Aluno aluno) {
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[alunos.length - 1] = aluno;
    }

    void imprimirListaDeAlunos() {
        Arrays.stream(alunos)
            .filter(Objects::nonNull)
            .map(aluno -> aluno.nome)
            .forEach(System.out::println);
    }
}
