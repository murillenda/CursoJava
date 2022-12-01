package cursojava.algaworks.arrays.umpoucodearraylist;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("fulanin");
        alunos.remove(1);
        alunos.removeIf(String::isEmpty);

        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);
        }
    }
}
