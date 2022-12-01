package cursojava.algaworks.boaspraticas.records;


public class Principal {
    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);

        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");
        agendamentoCabelo.setHorario(new Horario(-3, 2));

        System.out.println(agendamentoCabelo.getHorarioFormatado());
    }
}
