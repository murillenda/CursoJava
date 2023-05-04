package cursojava.algaworks.poo.precificacao;

import static java.lang.Math.PI;

public class Utils {
    public static Double calcularAreaQuadrado(Integer area) {
        return Math.pow(area, 2);
    }

    public static Double calcularRaioCirculo(Integer raio) {
        return (calcularAreaQuadrado(raio)) * PI;
    }

}
