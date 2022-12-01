package cursojava.threadSwing;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {

        //----------------------------------------------------divisão threads


        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        Thread threadNotaFiscal = new Thread(thread2);
        threadNotaFiscal.start();

        //Chegou ao fim do fluxo de trabalho
        System.out.println("Chegou ao fim do fluxo de trabalho");
        //fluxo do sistem, cadastro de venda ou algo do tipo
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }
    private static final Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            //codigo da rotina

            //Código que eu quero executar em paralelo do envio do email
            for (int pos = 0; pos < 10; pos++) {
                //Quero executar esse envio com um tempo de parada
                System.out.println("Executando algo rotina, por exemplo, envio de email");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        //Fim do código em paralelo
    };
    private static final Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            //codigo da rotina

            //Código que eu quero executar em paralelo do envio do email
            for (int pos = 0; pos < 10; pos++) {
                //Quero executar esse envio com um tempo de parada
                System.out.println("Executando algo rotina, por exemplo, envio de nota fiscal");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        //Fim do código em paralelo
    };
}
