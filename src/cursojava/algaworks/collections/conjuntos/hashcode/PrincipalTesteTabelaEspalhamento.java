package cursojava.algaworks.collections.conjuntos.hashcode;

import java.util.HashSet;
import java.util.Set;

public class PrincipalTesteTabelaEspalhamento {
    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();
        System.out.println("--------");
        contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        System.out.println("-----");
        contatos.add(new Contato("Josefina", "josefina@algaworks.com", 70));
        System.out.println("-----");
        contatos.add(new Contato("Josefina", "josefina@algaworks.com", 70));
        //Para testar incluir o print no equals/hashcode:
        // System.out.printf("%s = %s%n", getEmail(), ((Contato) o).getEmail());
        // E também colocar no hashcode:         return email.charAt(0);
        contatos.add(null);
    }
}
