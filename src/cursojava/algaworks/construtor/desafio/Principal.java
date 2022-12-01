package cursojava.algaworks.construtor.desafio;

public class Principal {
    public static void main(String[] args) {
        var participante = new Participante("Junin");
        System.out.println("participante1 = " + participante);

        var participante2 = new Participante("local", 4);
        System.out.println("participante2 = " + participante2);

        var participante3 = new Participante("oioi", -3);
        System.out.println("participante3 = " + participante3);

        var participante4 = new Participante(null, 3);
        System.out.println("participante4 = " + participante4);
    }
}
