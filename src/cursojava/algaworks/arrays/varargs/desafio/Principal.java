package cursojava.algaworks.arrays.varargs.desafio;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Double[] notas = {1.1, 5.5, 10.1, 3.3, 8.8};

        var notasAluno = new Notas();

        List<String> notasString = notasAluno.transformNotasToString(notas);

        notasAluno.setNumeroObrigatorioUm(notasString.get(0));
        notasAluno.setNumeroObrigatorioDois(notasString.get(1));

        var murillo = new Aluno();
        murillo.setNome("Murillo");
        murillo.setNotas(notasAluno);

        System.out.println(
            murillo.calcularMedia(
                murillo.getNotas(),
                notas[2].toString(),
                notas[3].toString(),
                notas[4].toString()));
    }
}
