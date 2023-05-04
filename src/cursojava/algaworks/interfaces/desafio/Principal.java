package cursojava.algaworks.interfaces.desafio;

import cursojava.algaworks.interfaces.desafio.model.Caminhao;
import cursojava.algaworks.interfaces.desafio.model.CarroParticular;
import cursojava.algaworks.interfaces.desafio.model.ImovelResidencial;
import cursojava.algaworks.interfaces.desafio.service.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {

        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();
        CarroParticular carro = new CarroParticular("HR-V", 150_000, 2022);
        Caminhao caminhao= new Caminhao("Actros", 780_000, 2021, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(imovel);

    }
}
