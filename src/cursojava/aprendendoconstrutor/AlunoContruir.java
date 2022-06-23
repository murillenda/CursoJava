package cursojava.aprendendoconstrutor;

import POO.Aluno;

public class AlunoContruir {
    public static void main(String[] args) {
        // new Aluno() é uma instância (Criação de Objeto)(Construtores)
        // Aluno é um Objeto
        // aluno1 é uma referência ao objeto aluno
        Aluno aluno1 = new Aluno(); // João
        aluno1.setNome("João");
        aluno1.setIdade(20);
        aluno1.setDataDeNascimento("28/05/2000");
        aluno1.setRegistroGeral("213321.32");
        aluno1.setNumeroCpf("213.321.321.44");
        aluno1.setNomeMae("Giona");
        aluno1.setNomePai("Stuart");
        aluno1.setDataMatricula("21/01/2017");
        aluno1.setNomeEscola("Juuuninhosgalei");
        aluno1.setSerieMatriculado("5° ano");

        System.out.println("Nome é: " + aluno1.getNome());
        System.out.println("Idade é " + aluno1.getIdade());
        System.out.println("Nascimento é " + aluno1.getDataDeNascimento());

        Aluno aluno2 = new Aluno(); // Pedro

        Aluno aluno3 = new Aluno(); // Alex

        Aluno aluno4 = new Aluno("Matheus");

        Aluno aluno5 = new Aluno("João", 30);
    }
}
