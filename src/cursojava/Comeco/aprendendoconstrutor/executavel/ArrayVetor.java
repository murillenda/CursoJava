package cursojava.Comeco.aprendendoconstrutor.executavel;

import cursojava.Comeco.aprendendoconstrutor.Model.Aluno;
import cursojava.Comeco.aprendendoconstrutor.Model.Disciplina;

public class ArrayVetor {
    public static void main(String[] args) {

//        Array pode ser de todos os tipos de dados e objetos também

        /*Array sempre deve ter a quantidade de posições definidas*/
//        String quantidade = JOptionPane.showInputDialog("Digite a quantidade de locais na lista: ");
//
//        double[] notas = new double[Integer.parseInt(quantidade)];
//
//        /*double[] valores = {0.2, 1, 3};
//        String[] valores2 = {"oi", "Teste"};*/
//
//        for (int pos = 0; pos < Integer.parseInt(quantidade); pos++) {
//            String nota = JOptionPane.showInputDialog("Digite a nota " + (pos + 1) + ":");
//            notas[pos] = Double.parseDouble(nota);
//        }
//
//        for (int pos = 0; pos < notas.length; pos++) {
//            System.out.println("Nota " + (pos + 1) + " é " + notas[pos]);
//        }
//
//        double c = Arrays.stream(notas).sum();
//
//        System.out.println(Arrays.toString(notas));
//        System.out.println("Soma = " + c);

        double[] notas = {8.8, 9.7, 7.6, 6.6};
        double[] notas2 = {9.3, 4.3, 9.3, 6.4};
        //Criação do aluno
        Aluno aluno = new Aluno();
        aluno.setNome("José");
        aluno.setNomeEscola("Ls");
        //Criação das disciplinas
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Model");
        disciplina2.setNota(notas2);

        aluno.getDisciplinas().add(disciplina2);

        Aluno[] alunos = new Aluno[1];

        alunos[0] = aluno;

        for(int pos = 0; pos < alunos.length; pos++) {
            System.out.println("Nome do aluno é: " + alunos[pos].getNome());
            for (Disciplina dsp : alunos[pos].getDisciplinas()) {
                System.out.println("Nome da disciplina é: " + dsp.getDisciplina());
                for (int pos2 = 0; pos2 < dsp.getNota().length; pos2++) {
                    System.out.println("Nota " + (pos2 + 1) + ": " + dsp.getNota()[pos2]);
                }
            }
        }

        /*System.out.println("Aluno " + aluno.getNome() + " da escola " + aluno.getNomeEscola());
        for (Disciplina dsc: aluno.getDisciplinas()) {
            System.out.println("______________________________________________________________________________");
            System.out.println("Disciplina do aluno: " + dsc.getDisciplina() + "\nCom as notas de: ");
            double notaMax = 0.0;
            double notaMin = 0.0;

            for (int pos = 0; pos < dsc.getNota().length; pos++) {
                System.out.println("Nota " + pos + " é: " + dsc.getNota()[pos]);
                if (pos == 0) {
                    notaMax = dsc.getNota()[pos];
                } else if (dsc.getNota()[pos] > notaMax) {
                    notaMax = dsc.getNota()[pos];
                }
                if (pos == 0) {
                    notaMin = dsc.getNota()[pos];
                } else if (dsc.getNota()[pos] < notaMin) {
                    notaMin = dsc.getNota()[pos];
                }
            }

            System.out.println("Maior nota da disciplina: " + dsc.getDisciplina() + " é " + notaMax);
            System.out.println("Menor nota da disciplina: " + dsc.getDisciplina() + " é " + notaMin);
            System.out.println("Média das notas: " + dsc.getMediaNotas());
        }*/
    }
}
