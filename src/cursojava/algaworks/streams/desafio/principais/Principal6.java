package cursojava.algaworks.streams.desafio.principais;

import cursojava.algaworks.streams.desafio.Cliente;
import cursojava.algaworks.streams.desafio.ServicoDeVenda;
import cursojava.algaworks.streams.desafio.Venda;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class Principal6 {
    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<String> clientes = vendas.stream()
            .filter(Venda::isFechada)
            .map(Venda::getCliente)
            .map(Cliente::nome)
            .distinct()
            .sorted()
            .collect(toList());

        System.out.println(clientes);

        /*

        List<String> clientes = new ArrayList<>();

        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                if (!clientes.contains(venda.getCliente().nome())) {
                    clientes.add(venda.getCliente().nome());
                }
            }
        }

        Collections.sort(clientes);
        System.out.println(clientes);

         */
    }
}
