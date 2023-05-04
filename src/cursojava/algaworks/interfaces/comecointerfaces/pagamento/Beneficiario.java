package cursojava.algaworks.interfaces.comecointerfaces.pagamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beneficiario {

    private String nome;
    private String chavePix;
    private String contaBancaria;

    public Beneficiario(String nome, String chavePix, String contaBancaria) {
        this.nome = nome;
        this.chavePix = chavePix;
        this.contaBancaria = contaBancaria;
    }

    public boolean naoPossuiChavePix() {
        return getChavePix() == null || getChavePix().isEmpty();
    }

    public boolean naoPossuiContaBancaria() {
        return getContaBancaria() == null || getContaBancaria().isEmpty();
    }

}
