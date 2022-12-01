package cursojava.Comeco.aprendendoconstrutor;

import cursojava.Comeco.aprendendoconstrutor.Model.Aluno;
import cursojava.Comeco.aprendendoconstrutor.Model.Diretor;
import cursojava.Comeco.aprendendoconstrutor.Model.Disciplina;
import cursojava.Comeco.aprendendoconstrutor.classesauxiliares.FuncaoAutenticacao;
import cursojava.Comeco.aprendendoconstrutor.constantes.StatusAluno;
import cursojava.Comeco.aprendendoconstrutor.excessao.ExceptionProcessarNota;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AlunoContruir {
    public static void main(String[] args) throws ExceptionProcessarNota {

        try {
            lerArquivo();

            String login = JOptionPane.showInputDialog("Informe o login: ");
            String senha = JOptionPane.showInputDialog("Informe a senha: ");

            if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

                List<Aluno> alunos = new ArrayList<>();

                //É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também
                HashMap<String, List<Aluno>> maps = new HashMap<>();

                for(int i = 1; i <= 1; i++) {

                    // new Aluno() é uma instância (Criação de Objeto)(Construtores)
                    // Aluno é um Objeto
                    // aluno1 é uma referência ao objeto aluno

                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
                    String idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
                    /*String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento do aluno: ");
                    String registroGeral = JOptionPane.showInputDialog("Registro geral do aluno: ");
                    String numeroCpf = JOptionPane.showInputDialog("Cpf do aluno: ");
                    String nomeMae = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
                    String nomePai = JOptionPane.showInputDialog("Nome do pai do aluno: ");
                    String dataMatricula = JOptionPane.showInputDialog("Data da matrícula do aluno: ");
                    String nomeEscola = JOptionPane.showInputDialog("Nome escola do aluno: ");
                    String serieMatriculado = JOptionPane.showInputDialog("Série matriculado: ");*/

                    Aluno aluno1 = new Aluno(); // João
                    aluno1.setNome(nome);
                    aluno1.setIdade(Integer.parseInt(idade));
                    /*aluno1.setDataDeNascimento(dataDeNascimento);
                    aluno1.setRegistroGeral(registroGeral);
                    aluno1.setNumeroCpf(numeroCpf);
                    aluno1.setNomeMae(nomeMae);
                    aluno1.setNomePai(nomePai);
                    aluno1.setDataMatricula(dataMatricula);
                    aluno1.setNomeEscola(nomeEscola);
                    aluno1.setSerieMatriculado(serieMatriculado);*/

                    for (int pos = 1; pos <= 2; pos++) {
                        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + ": ");
                        String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + ": ");
                        Disciplina disciplina = new Disciplina();

                        disciplina.setDisciplina(nomeDisciplina);

                        aluno1.getDisciplinas().add(disciplina);
                    }

                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma discipina?");
                    int continuaRemover = 0;
                    int posicao = 1;

                    if (escolha == 0) {
                        while (continuaRemover == 0) {
                            String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4: ");
                            aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
                            posicao++;
                            continuaRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                        }
                    }
                    alunos.add(aluno1);
                }

                maps.put(StatusAluno.APROVADO, new ArrayList<>());
                maps.put(StatusAluno.REPROVADO, new ArrayList<>());
                maps.put(StatusAluno.RECUPERACAO, new ArrayList<>());

                for (Aluno aluno : alunos) { //Separei em listas
                    if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                        maps.get(StatusAluno.APROVADO).add(aluno);
                    } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                        maps.get(StatusAluno.REPROVADO).add(aluno);
                    } else {
                        maps.get(StatusAluno.RECUPERACAO).add(aluno);
                    }
                }

                for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                    System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
                }

                for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                    System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
                }

                for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                    System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de " + aluno.getMediaNota());
                }


                //Trocar aluno
        //        for (int pos = 0; pos < alunos.size() ; pos++) {
        //            Aluno aluno = alunos.get(pos);
        //            if (aluno.getNome().equalsIgnoreCase("Murillo")) {
        //                Aluno trocar = new Aluno();
        //                trocar.setNome("Aluno foi Trocado");
        //                Disciplina disciplina = new Disciplina();
        //                disciplina.setDisciplina("Matematica");
        //                disciplina.setNota(98.0);
        //
        //                trocar.getDisciplinas().add(disciplina);
        //                alunos.set(pos, trocar);
        //                aluno = alunos.get(pos);
        //            }
        //
        //            System.out.println("Aluno = " + aluno.getNome());
        //            System.out.println("Média do aluno = " + aluno.getMediaNota());
        //            System.out.println("Resultado = " + aluno.getAlunoAprovado2());
        //            System.out.println("------------------------------------------------------");
        //
        //            for (Disciplina disciplina : aluno.getDisciplinas()) {
        //                System.out.println("Matéria = " + disciplina.getDisciplina() + "Nota = " + disciplina.getNota());
        //            }
        //        }



        //        //Equals e Hashcode (Diferenciar e comparar objetos)
        //        Aluno aluno2 = new Aluno();
        //        aluno2.setNome("Murillo");
        //
        //        Aluno aluno3 = new Aluno();
        //        aluno3.setNome("Murillo");
        //
        //        if (aluno2.equals(aluno3)) {
        //            System.out.println("Alunos iguais");
        //        } else {
        //            System.out.println("Alunos diferentes");
        //        }
            } else {
                JOptionPane.showMessageDialog(null, "Acesso não permitido");
            }
        } catch (Exception e) {
            StringBuilder saida = new StringBuilder();

            e.printStackTrace();
            System.out.println("Mensagem: " + e.getMessage());

            for (int pos = 0; pos < e.getStackTrace().length; pos++) {
                saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
                saida.append("\n Método de erro: ").append(e.getStackTrace()[pos].getMethodName());
                saida.append("\n Linha de erro: ").append(e.getStackTrace()[pos].getLineNumber());
                saida.append("\n Class: ").append(e.getClass().getName());
            }
            JOptionPane.showMessageDialog(null, "Erro ao processar notas" + saida.toString());
        } finally { //Sempre é executado ocorrendo o erro ou não
            JOptionPane.showMessageDialog(null, "Obrigado por aprender java comigo");
        }
    }
    public static void lerArquivo() throws FileNotFoundException {
            File file = new File ("c://lines.txt");
            Scanner scanner = new Scanner(file);
    }
}
