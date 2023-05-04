package cursojava.algaworks.enumeracoes.pedido;

public class Principal {
    public static void main(String[] args) {
        ServicoCancelamentoPedido servico = new ServicoCancelamentoPedido();

        Pedido pedido = new Pedido();

        pedido.setNomeCliente("Murillo");
        pedido.setValorTotal(101);

        servico.cancelar(pedido, TipoUsuario.CLIENTE);

        System.out.println(pedido.getStatus());
    }

}
