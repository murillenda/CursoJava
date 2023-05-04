package cursojava.algaworks.classesaninhadas.estaticas;

import lombok.Getter;

public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n", mensagem.remetente
            , mensagem.getDestinatario(), mensagem.getTexto());
    }

    public static String gerarAssinatura() {
        return "\n--\nAlgaworks";
    }

    @Getter
    public static class Mensagem {

        private final String remetente;
        private final String destinatario;
        private final String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public String getTexto() {
            return texto + gerarAssinatura();
        }

    }

}
