package cursojava.Comeco.aprendendoconstrutor.executavel;

import cursojava.Comeco.aprendendoconstrutor.Model.Aluno;
import cursojava.Comeco.aprendendoconstrutor.Model.Diretor;
import cursojava.Comeco.aprendendoconstrutor.Model.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Murillo");
        aluno.setIdade(21);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("1238128321");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setNivelCargo("sim");
        secretario.setIdade(19);


        System.out.println(aluno.maiorDeIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.maiorDeIdade());
        System.out.println(secretario.maiorDeIdade());

    }
}
