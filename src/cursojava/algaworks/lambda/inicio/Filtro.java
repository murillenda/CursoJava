package cursojava.algaworks.lambda.inicio;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}
