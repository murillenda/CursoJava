package cursojava.algaworks.arrays.varargs;

import java.util.Objects;

public class ServicoDeCobranca {

    void pagar(Fatura fatura, String emailsCobranca, String... emailsAdicionais) {
        Objects.requireNonNull(fatura, "Informe a fatura");
        Objects.requireNonNull(emailsCobranca, "Informe o email cobrança");

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
            fatura.numero, fatura.valorTotal);

        enviarNotificacao(fatura, emailsCobranca);

        for (String email : emailsAdicionais) {
            enviarNotificacao(fatura, email);
        }
    }

    private static void enviarNotificacao(Fatura fatura, String emailCobranca) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, emailCobranca);
    }
}
