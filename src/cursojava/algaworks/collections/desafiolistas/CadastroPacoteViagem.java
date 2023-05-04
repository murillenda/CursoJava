package cursojava.algaworks.collections.desafiolistas;

import java.util.*;

public class CadastroPacoteViagem {

    private final List<PacoteViagem> pacotesViagens = new LinkedList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if (pacotesViagens.contains(pacoteViagem)) {
            throw new PacoteJaExistenteException("Pacote com a descrição informada já existe na lista");
        }

        pacotesViagens.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotesViagens;
    }

    public void ordenar() {
        Collections.sort(pacotesViagens);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotesViagens.sort(new PrecoPacoteViagemComparator().reversed()
            .thenComparing(Comparator.naturalOrder()));
    }

    public void removerPorDescricao(String descricao) {
        boolean itemRemovido = false;
        Iterator<PacoteViagem> pacoteViagemIterator = pacotesViagens.iterator();

        while (pacoteViagemIterator.hasNext()) {
            PacoteViagem pacoteViagem = pacoteViagemIterator.next();
            if (pacoteViagem.getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
                itemRemovido = true;
            }
        }

        if (!itemRemovido) {
            throw new PacoteNaoEncontradoException("Não foi encontrado nenhum pacote com essa descrição");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacoteViagem : pacotesViagens) {
            if (pacoteViagem.getDescricao().equals(descricao)) {
                return pacoteViagem;
            }
        }

        throw new PacoteNaoEncontradoException("Não foi encontrado nenhum pacote com essa descrição");
    }
}
