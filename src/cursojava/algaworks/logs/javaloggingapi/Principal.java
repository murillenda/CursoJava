package cursojava.algaworks.logs.javaloggingapi;

import cursojava.algaworks.logs.javaloggingapi.exception.SaldoInsuficienteException;
import cursojava.algaworks.logs.javaloggingapi.model.ContaCorrente;
import cursojava.algaworks.logs.javaloggingapi.model.Titular;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    private static final Logger logger = Logger.getLogger(ContaCorrente.class.getName());

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);
        try {
            logger.fine("Manipulando conta...");
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));
            //contaCorrente.sacar(new BigDecimal("300"));
            contaCorrente.sacar(new BigDecimal("-10"));
        } catch (SaldoInsuficienteException e) {
            //Logger warning no cath colocando saldoinsuficienteexception
            logger.log(Level.WARNING, "Pedido de saque com saldo insuficiente para a conta" +
                contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);

            logger.warning("Pedido de saque com saldo insuficiente para a conta "
                + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero());
        } catch (Exception e) {
            // logger severe no catch com exception generica
            logger.log(Level.SEVERE, "Erro administrando conta corrente "
                + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        }
    }
}
