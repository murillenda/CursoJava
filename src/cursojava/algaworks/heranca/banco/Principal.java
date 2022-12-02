package cursojava.algaworks.heranca.banco;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Murillo", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(24.9);
        conta1.imprimirDemonstrativo();
    }
}
