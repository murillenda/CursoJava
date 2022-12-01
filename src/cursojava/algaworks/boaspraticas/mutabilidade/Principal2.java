package cursojava.algaworks.boaspraticas.mutabilidade;

import static cursojava.algaworks.boaspraticas.mutabilidade.CalculadoraHorario.somarDuasHoras;

public class Principal2 {
    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        Horario novoHorario = somarDuasHoras(horario);

        agendamentoCabelo.setHorario(new Horario(16, 20));

        System.out.println(agendamentoCabelo.getHorarioFormatado());
        System.out.println(novoHorario.formatar());
    }
}
