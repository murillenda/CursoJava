package cursojava.algaworks.heranca.banco;

public class Principal3 {
    public static void main(String[] args) {
        var titular1 = new Titular("Murillo", "12312312300");
        ContaEspecial conta1 = new ContaEspecial(titular1, 1234, 999999, 1000);
        conta1.setTarifaMensal(90);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }
}
