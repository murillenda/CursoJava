package cursojava.algaworks.logs.slf4jcomjavaloggingapi;

import cursojava.algaworks.logs.slf4jcomjavaloggingapi.exception.SaldoInsuficienteException;
import cursojava.algaworks.logs.slf4jcomjavaloggingapi.model.ContaCorrente;
import cursojava.algaworks.logs.slf4jcomjavaloggingapi.model.Titular;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class Principal {

    private static final Logger logger = LoggerFactory.getLogger(Principal.class);

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);
        try {
            logger.debug("Manipulando conta...");
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));
            //contaCorrente.sacar(new BigDecimal("300"));
            contaCorrente.sacar(new BigDecimal("-10"));
        } catch (SaldoInsuficienteException e) {
            logger.warn("Pedido de saque com saldo insuficiente para a conta" +
                contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        } catch (Exception e) {
            // logger severe no catch com exception generica
            logger.error("Erro administrando conta corrente "
                + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        }
    }
}
