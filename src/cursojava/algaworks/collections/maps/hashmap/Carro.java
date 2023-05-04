package cursojava.algaworks.collections.maps.hashmap;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Carro {

    private final String placa;
    private final String modelo;

    public Carro(String placa, String modelo) {
        Objects.requireNonNull(placa);
        Objects.requireNonNull(modelo);
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
            "placa='" + placa + '\'' +
            ", modelo='" + modelo + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return getPlaca().equals(carro.getPlaca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaca());
    }
}
