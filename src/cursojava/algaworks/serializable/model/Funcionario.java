package cursojava.algaworks.serializable.model;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

// Implementamos Serializable, não necessita de nenhuma sobrescrita de método, pois é uma interface vazia
// Mais conhecida como Interface de marcação, que é usada apenas para indicar que uma classe tem uma determinada
// Semantica, uma determinada caracteristica
// A característica aqui é para dizer que a classe Funcionario pode ser serializada
public class Funcionario implements Serializable {

    // Quando Serializamos um objeto de uma classe, se não especificamos nava, é dado um número de versão
    // da estrutura da classe dinâmicamente de acordo com a estrutura da classe.
    // E quando vamos desserializar, ele calcula novamente, se adicionarmos um método a mais por exemplo,
    // os códigos vão ser diferentes, e por isso nós adicionamos aqui o serialVersionUID na mão
    // E podemos adicionar o serialVersionUID assim:
    @Serial // Anotação do java.io para evitar erros de digitação, ela indica que o que estamos anotando faz parte do mecanismo de serialização
    private static final long serialVersionUID = -317571931583374150L;
    // Agora caso alterarmos essa classe e achar que não seja compatível com a versão anterior, devemos alterar o número
    // de versão também.

    // Para serializar uma classe, as propriedades dessa classe também tem que ser serializaveis
    // Se entrarmos na classe String, LocalDate e BigDecimal, podemos notar que também implementam
    // Serializable.
    // Caso alguma delas não fossem serializaveis, teriamos problemas na serialização
    private String nome;
    private LocalDate dataNascimento;
    private transient BigDecimal salario;    // a palavra-chave transient faz com que essa propriedade não seja serializada
    // Logo as propriedades que não foram salvas no arquivo Serializado, serão inicializadas com o valor default

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
            "nome='" + nome + '\'' +
            ", dataNascimento=" + dataNascimento +
            ", salario=" + salario +
            '}';
    }
}
