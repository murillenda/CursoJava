package cursojava.algaworks.poo.carro;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;
    private Integer anoNascimento;

}
