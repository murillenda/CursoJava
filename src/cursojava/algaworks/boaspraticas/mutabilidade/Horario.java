package cursojava.algaworks.boaspraticas.mutabilidade;

import lombok.Getter;

@Getter
public final class Horario {

    private final int hora;
    private final int minuto;

    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }

        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        this.hora = hora;
        this.minuto = minuto;
    }

    public String formatar() {
        return String.format("%dh%dm", getHora(), getMinuto());
    }
}
