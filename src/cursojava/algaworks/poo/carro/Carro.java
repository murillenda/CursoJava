package cursojava.algaworks.poo.carro;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Carro {
    private static final int VIDA_UTIL_CARRO_EM_ANOS = 20;
    private static final int VALOR_ANOS_NAO_PAGA_IPVA = 10;

    @EqualsAndHashCode.Include
    private Long id;
    private String cor;
    private String fabricante;
    private String modelo;
    private String anoFabricacao;
    private Pessoa proprietario;
    private BigDecimal preco;

    public double retornarCalculoIpva() {
        int tempoDeUsoEmAnos = retornarCalculoTempoDeUsoEmAnos();
        var ipva = retornarCalculoValorRevenda() * 0.4;
        return tempoDeUsoEmAnos >= VALOR_ANOS_NAO_PAGA_IPVA ? 0 : ipva;
    }

    public void imprimirResumoDepreciacao() {
        var valorRevenda = retornarCalculoValorRevenda();
        var tempoDeUsoMeuCarro = retornarCalculoTempoDeUsoEmAnos();
        var ipvaMeuCarro = retornarCalculoIpva();

        if(getPreco().compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Carro com preço de compra zerado." +
                "Não foi possível imprimir resumo de depreciação.");
            return;
        }

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("valorRevenda: %6.2f%n", valorRevenda);
        System.out.printf("IPVA: %6.2f%n", ipvaMeuCarro);
    }

    public int retornarCalculoTempoDeUsoEmAnos() {
        var dataHoje = LocalDate.now().getYear();
        return dataHoje - Integer.parseInt(getAnoFabricacao());
    }

    public double retornarCalculoValorRevenda() {
        var tempoDeUsoEmAnos = this.retornarCalculoTempoDeUsoEmAnos();

        double valorRevenda = (Double.parseDouble(String.valueOf(getPreco())) / VIDA_UTIL_CARRO_EM_ANOS)
            * (VIDA_UTIL_CARRO_EM_ANOS - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

}
