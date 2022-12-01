package cursojava.algaworks.poo.carro;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {

        var meuCarro = new Carro();

        meuCarro.setId(1L);
        meuCarro.setCor("Rosa");
        meuCarro.setAnoFabricacao("2018");
        meuCarro.setModelo("HR-V");
        meuCarro.setFabricante("Honda");
        meuCarro.setPreco(BigDecimal.valueOf(980_000));

        var meuProprietario = new Pessoa();
        meuProprietario.setId(1L);
        meuProprietario.setCpf("8127389231");
        meuProprietario.setNome("Voce");
        meuProprietario.setAnoNascimento(1998);

        double ipva = meuCarro.retornarCalculoIpva();
        System.out.println("ipva = " + ipva);

        meuCarro.setProprietario(meuProprietario);
        meuCarro.imprimirResumoDepreciacao();
    }
}
