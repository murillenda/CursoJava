package cursojava.algaworks.heranca.banco;

public class Principal1 {
    public static void main(String[] args) {
        var titular1 = new Titular("Murillo", "12312312300");
        Conta conta1 = new Conta(titular1, 1234, 999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(290);
        conta1.imprimirDemonstrativo();
    }
}
