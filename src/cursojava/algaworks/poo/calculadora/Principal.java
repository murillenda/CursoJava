package cursojava.algaworks.poo.calculadora;

public class Principal {
    public static void main(String[] args) {
        var calculadoraImc = new CalculadoraImc();

//        calculadoraImc.altura = 1.82;
//        calculadoraImc.peso = 175;
        var joao = new Paciente();
        joao.setPeso(175);
        joao.setAltura(1.82);

        var imc = calculadoraImc.calcular(joao);

        if(imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                "está com obesidade %n", imc.altura, imc.peso);
        }
        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
