package cursojava.algaworks.logs.javaloggingapi.model;


import cursojava.algaworks.logs.javaloggingapi.exception.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

// No JUL existem 7 níveis de log
/*
 SEVERE (HIGHEST VALUE)
        Esse primeiro indica um erro severo na aplicação que requer atenção e correção imediata, pois se não for corrigido
        tem algum problema ali.

 WARNING
        Esse é usado para avisar sobre alguma inconsistencia ou algum potêncial problema, mas que não é tão crítico,
        não irá impedir a execução da aplicação.

 INFO
        Esse é utilizado para mensagens que fornecem informações, mensagens informacionais, mensagens que apenas informam
        sobre alguma ação ou algum evento, não informa sobre erro, debug ou aviso

 CONFIG
        Esse é bem particular do JUL, é usado para informações da configuração da sua aplicação, é para informar
        por exemplos erros de configuração ou para informar sobre as configurações que foram carregadas e estão
        sendo usadas no software

 FINE
 FINER
 FINEST (lowest value)
         Esses três a seguir definem os 3 niveis de log mais baixos existentes
         São usadoa para mensagens que existem informações mais granulares, mais detalhadas e por isso é mais usado para
         debugging e rastreamento da execução do código.
 */

public class ContaCorrente {

    // Adicionando instância do log, geralmente ele é o nome totalmente qualificado de uma classe
    // ou seja, inclui o nome do pacote.nomeClasse
    // Aqui abrimos uma exceção para deixar logger em minusculo pois utilizamos muitas vezes no código, para ficar mais elegante
    private static final Logger logger = Logger.getLogger(ContaCorrente.class.getName());


    private final Titular titular;
    private final int agencia;
    private final int numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    public ContaCorrente(Titular titular, int agencia, int numero) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public final BigDecimal getSaldo() {
        return saldo;
    }

    protected void validarSaldoParaSaque(BigDecimal valorSaque) {
        if (getSaldo().compareTo(valorSaque) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }
    }

    public void sacar(BigDecimal valorSaque) {
        logger.fine("Realizando saque...");
        Objects.requireNonNull(valorSaque);

        if (valorSaque.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo = saldo.subtract(valorSaque);

        // Como a API é antiga, não foi feito com varargs, então é passado um array de objects
        logger.log(Level.INFO, "Saque de R${0} realizado na conta {1}",
            new Object[] { valorSaque, getAgencia() + "/" + getNumero() });

        // Logando uma mensagem de informação
        // Não passamos o localdatetime now e nem o nome da classe, pois o framework ja faz isso para nós
        logger.info(String.format("Saque de R$%.2f realizado na conta %s",
            valorSaque, getAgencia() + "/" + getNumero()));
    }

    public final void depositar(BigDecimal valorDeposito) {
        logger.fine("Realizando depósito...");
        Objects.requireNonNull(valorDeposito);

        if (valorDeposito.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }

        saldo = saldo.add(valorDeposito);

        logger.info(String.format("Deposito de R$%.2f realizado na conta %s%n",
            valorDeposito, getAgencia() + "/" + getNumero()));
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
            "titular=" + titular +
            ", agencia=" + agencia +
            ", numero=" + numero +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente contaCorrente = (ContaCorrente) o;
        return agencia == contaCorrente.agencia && numero == contaCorrente.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }

}
