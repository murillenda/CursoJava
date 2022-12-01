package cursojava.algaworks.boaspraticas.mutabilidade;

public class Principal1 {
    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);
    }

    public static void imprimir(Agendamento agendamento) {
        System.out.printf("%s às %s%n", agendamento.getDescricao(), agendamento.getHorarioFormatado());
    }
}
