package cursojava.algaworks.poo.visitante;

public class Principal {
    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.nome = "João";
        visitante.idade = 18;

        var maiorDeIdade = visitante.maiorDeIdade();

        if (maiorDeIdade) {
            System.out.println("Acesso liberado");
        } else {
            System.out.printf("Acesso não permitido para menores de %d anos", Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        }
    }
}
