package cursojava.Comeco.aprendendoconstrutor.Model;

import cursojava.Comeco.aprendendoconstrutor.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{

    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;

    //Arraylist de disciplinas
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno() {
    }

    // Setar padrão ao construtor
    public Aluno(String nomePadrao) {
        this.nome = nomePadrao;
    }
    // Setar padrão
    public Aluno(String nomePadrao, int idadePadrao) {
        this.nome = nomePadrao;
        this.idade = idadePadrao;
    }

    /* Métodos Setters e Getters do Objeto */

    //Set recebe dados

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    /* Metodo que retorna a média do aluno */
    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getMediaNotas();
        }

        return somaNotas / disciplinas.size();
    }

    /* Metodo que retorna aluno aprovado ou não (true or false)*/
    public boolean getAlunoAprovado() {
        return this.getMediaNota() >= 70;
    }

    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 50) {
            if (media >= 70) {
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
        } else {
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public Boolean maiorDeIdade() {
        return idade >= 21;
    }

    public String msgMaiorIdade() {
        return this.maiorDeIdade() ? "Aluno maior de idade" : "Aluno menor de idade";
    }

    @Override
    public double salario() {
        return 1500.90;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
