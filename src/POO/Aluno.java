package POO;

public class Aluno {

    String nome;
    int idade;
    String dataDeNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    public Aluno() {

    }

    public Aluno(String nomePadrao) {
        this.nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        this.nome = nomePadrao;
        this.idade = idadePadrao;
    }
}
