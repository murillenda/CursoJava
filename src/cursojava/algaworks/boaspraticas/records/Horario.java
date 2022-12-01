package cursojava.algaworks.boaspraticas.records;

// Record só tem no java 14+
// Qualquer record é final implicitamente
public record Horario(int hora, int minuto) {
    // Com record automaticamente o compilador vai criar as variáveis de instancia já sendo private final
    private static final int ZERO = 0;
    private static final int HORA_LIMITE_DIA = 24;
    private static final int MINUTO_LIMITE_HORA = 59;

    public Horario {
        validaHora(hora);
        validaMinuto(minuto);
    }

    //Getters não possuem o nome GET, mas somente o nome da variável como por exemplo hora()

    public String formatar() {
        return String.format("%dh%dm", hora(), minuto());
    }

    private void validaHora(int hora) {
        if (horaInvalida(hora)) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
    }
    private void validaMinuto(int minuto) {
        if (minutoInvalido(minuto)) {
            throw new IllegalArgumentException("Minuto inválido " + minuto);
        }
    }

    private boolean horaInvalida(int hora) {
        return horaMenorQueZero(hora) || horaMaiorQueOPadraoExistenteEmUmDia(hora);
    }

    private boolean minutoInvalido(int minuto) {
        return minutoMenorQueZero(minuto) || minutoMaiorQueOPadraoExistenteEmUmaHora(minuto);
    }

    private boolean minutoMaiorQueOPadraoExistenteEmUmaHora(int minuto) {
        return minuto > MINUTO_LIMITE_HORA;
    }

    private boolean minutoMenorQueZero(int minuto) {
        return minuto < ZERO;
    }

    private boolean horaMenorQueZero(int hora) {
        return hora < ZERO;
    }

    private boolean horaMaiorQueOPadraoExistenteEmUmDia(int hora) {
        return hora >= HORA_LIMITE_DIA;
    }
}
