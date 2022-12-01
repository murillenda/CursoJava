package cursojava.algaworks.arrays.varargs.desafio;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class Notas {

    private String numeroObrigatorioUm;
    private String numeroObrigatorioDois;

    public List<String> transformNotasToString(Double[] notas) {
        return Arrays.stream(notas)
            .map(Object::toString)
            .collect(Collectors.toList());
    }
}
