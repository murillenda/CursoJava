package cursojava.algaworks.arrays.varargs.desafio;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
public class Aluno {

    private String aluno;
    private Notas notas;
    private Double media;

    public Double calcularMedia(Notas numerosObrigatorios, String... arrayNumeros) {
        Objects.requireNonNull(numerosObrigatorios,
            "Numeros obrigatórios não podem ser nulos");
        Objects.requireNonNull(numerosObrigatorios.getNumeroObrigatorioDois(),
            "Deve conter pelo menos dois números");

        List<Double> listaNumeros = new ArrayList<>();
        listaNumeros.add(Double.valueOf(numerosObrigatorios.getNumeroObrigatorioUm()));
        listaNumeros.add(Double.valueOf(numerosObrigatorios.getNumeroObrigatorioDois()));

        for (String numero: arrayNumeros) {
            listaNumeros.add(Double.valueOf(numero));
        }

        return listaNumeros.stream()
            .collect(Collectors.summarizingDouble(Double::doubleValue)).getAverage();
    }
}
