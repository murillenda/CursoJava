package cursojava.algaworks.poo.visitante;

public class CadastroPortaria {

    void cadastrar(Visitante visitante, int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastro para %d dias%n",
            visitante.nome, tempoExpiracaoEmDias);
    }

}
