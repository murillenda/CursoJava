package cursojava.algaworks.arrays.colegio;

public class Expansao {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.indentificacao = "maternal";
        turmaB.nomeProfessora = "raquel";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "joão";
        aluno1.idade = 1;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "serigo";
        aluno2.idade = 3;

        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);
        turmaB.imprimirListaDeAlunos();
    }
}
