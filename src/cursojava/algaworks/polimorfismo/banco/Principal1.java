package cursojava.algaworks.polimorfismo.banco;

import cursojava.algaworks.heranca.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        var titular1 = new Titular("Murillo", "12312312300");
        ContaEspecial conta1 = new ContaEspecial(titular1, 1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(100);
        conta1.creditarRendimentos(10);

        ContaInvestimento conta2 = new ContaInvestimento(titular1, 1234, 999999);
        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        ContaSalario conta3 = new ContaSalario(titular1, 1234, 999999, 18_000);
        conta3.depositar(100);



        caixaEletronico.imprimirDemonstrativo(conta1);
    }
}
