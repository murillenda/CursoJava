package cursojava.algaworks.streams.desafio.principais;

import cursojava.algaworks.streams.desafio.Cliente;
import cursojava.algaworks.streams.desafio.ServicoDeVenda;
import cursojava.algaworks.streams.desafio.Venda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        vendas.stream()
            .filter(Venda::isFechada)
            .map(Venda::getCliente)
            .distinct()
            .sorted(Comparator.comparing(Cliente::nome))
            .forEach(System.out::println);

        /*
        List<Cliente> clientes = new ArrayList<>();
        for (Venda venda : vendas) {
            if (venda.isFechada() && !clientes.contains(venda.getCliente())) {
                clientes.add(venda.getCliente());
            }
        }
        clientes.sort(Comparator.comparing(Cliente::nome));

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
         */
    }
}
