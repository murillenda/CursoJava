package cursojava.algaworks.heranca.banco;

public class Principal2 {
    public static void main(String[] args) {
        var titular1 = new Titular("Murillo", "12312312300");
        ContaInvestimento conta1 = new ContaInvestimento(titular1, 1234, 999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }
}
