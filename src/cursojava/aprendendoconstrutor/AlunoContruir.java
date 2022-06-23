package cursojava.aprendendoconstrutor;

import POO.Aluno;

import javax.swing.*;
import java.util.Objects;

public class AlunoContruir {
    public static void main(String[] args) {
        // new Aluno() é uma instância (Criação de Objeto)(Construtores)
        // Aluno é um Objeto
        // aluno1 é uma referência ao objeto aluno

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
        String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento do aluno: ");
        String registroGeral = JOptionPane.showInputDialog("Registro geral do aluno: ");
        String numeroCpf = JOptionPane.showInputDialog("Cpf do aluno: ");
        String nomeMae = JOptionPane.showInputDialog("Nome da mãe do aluno: ");
        String nomePai = JOptionPane.showInputDialog("Nome do pai do aluno: ");
        String dataMatricula = JOptionPane.showInputDialog("Data da matrícula do aluno: ");
        String nomeEscola = JOptionPane.showInputDialog("Nome escola do aluno: ");
        String serieMatriculado = JOptionPane.showInputDialog("Série matriculado: ");

        String nota1 = JOptionPane.showInputDialog("Nota 1: ");
        String nota2 = JOptionPane.showInputDialog("Nota 2: ");
        String nota3 = JOptionPane.showInputDialog("Nota 3: ");
        String nota4 = JOptionPane.showInputDialog("Nota 4: ");


        Aluno aluno1 = new Aluno(); // João
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataDeNascimento(dataDeNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serieMatriculado);



        System.out.println("Nome é: " + aluno1.getNome());
        System.out.println("Idade é " + aluno1.getIdade());
        System.out.println("Nascimento é " + aluno1.getDataDeNascimento());

        System.out.println("Média da nota do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));


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

    }
}
