package cursojava.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Var {
    public static void main(String[] args) {
        podeUsar();
        naoPodeUsar();
        String a = "textg";
        System.out.println(a.stripTrailing());
    }

    private static void podeUsar() {
        var i = 52;
        var apoie = "Seja Membro";
        var s = new Scanner(apoie);
        var list = List.of("Deixe", "um", "Comentario");
        //Melhores casos para usar -> onde entendo qual o tipo e reduzir tamanho da declaração e reduzir repetição

    }
    private static void naoPodeUsar() {
//        var apoie;
//        var i = null;

    }
}
