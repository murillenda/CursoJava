package cursojava.algaworks.boaspraticas.records;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agendamento {

    private Horario horario;
    private String descricao;

    public Agendamento(Horario horario, String descricao) {
        this.horario = horario;
        this.descricao = descricao;
    }

    public String getHorarioFormatado() {
        return horario.formatar();
    }
}
