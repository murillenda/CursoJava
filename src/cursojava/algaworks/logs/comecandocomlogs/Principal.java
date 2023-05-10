package cursojava.algaworks.logs.comecandocomlogs;

import cursojava.algaworks.logs.comecandocomlogs.model.ContaCorrente;
import cursojava.algaworks.logs.comecandocomlogs.model.Titular;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        // LEMBRANDO QUE NÃO É BOA PRÁTICA USAR LOGS EM PRINTS
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        contaCorrente.depositar(new BigDecimal("200"));
        contaCorrente.sacar(new BigDecimal("50.5"));
    }
}
