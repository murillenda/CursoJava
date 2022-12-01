package cursojava.threadSwing;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{
    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilhaFila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        System.out.println("Fila Rodando");

        while(true) {
            synchronized (pilhaFila) { //Bloquear acesso a esta lista por outros processos
                Iterator iteracao = pilhaFila.iterator();
                while(iteracao.hasNext()) {

                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //Pega o objeto atual

                    //Processar 10 mil notas fiscais
                    //Gerar uma lista enorme de PDF
                    //Gerar um envio em massa de email
                    System.out.println("------------------------------------");

                    System.out.println(processar.getEmail());
                    System.out.println(processar.getNome());

                    iteracao.remove();
                    try {
                        Thread.sleep(50); //Dar tempo para descarga de memória
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            try {
                Thread.sleep(1000); //Processou toda a lista dá um tempo para limpeza de memória
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
