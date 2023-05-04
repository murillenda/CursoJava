package cursojava.algaworks.heranca.banco;

public class Principal4 {
    public static void main(String[] args) {
        var titular1 = new Titular("Murillo", "12312312300");
        Conta conta1 = new ContaEspecial(titular1, 1234, 999999, 1000);

        System.out.println(conta1);
    }
}
