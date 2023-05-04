package cursojava.algaworks.collections.maps.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "18402866133");
        Proprietario ana = new Proprietario("Ana", "10927384699");
        Proprietario jose = new Proprietario("Jose", "19203855522");
        Proprietario joao = new Proprietario("Joao", "11122233344");

        Carro bmw = new Carro("ALGA23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porshe = new Carro("EJA0V44", "Porshe 911");

        //Map<chave,valor>
        Map<Carro, Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porshe, maria);

        //System.out.println(proprietarios);

        //System.out.println(proprietarios.get(bmw));
/*
        for (Carro carro : proprietarios.keySet()) {
            System.out.println(carro);
        }
*/
        /*
        for (Proprietario proprietario : proprietarios.values()) {
            System.out.println(proprietario);
        }

         */
        /*
        for (Carro carro : proprietarios.keySet()) {
            Proprietario proprietario = proprietarios.get(carro);
            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(),
                proprietario.getNome());
        }

         */

        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) = %s%n",
                entry.getKey().getPlaca(),
                entry.getKey().getModelo(),
                entry.getValue().getNome());
        }
    }

}
