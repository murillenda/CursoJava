package cursojava.algaworks.strings.pattern.manipulacaostringsregex;

public class Anonimizacao {
    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">\n          joao@gmail.com    </a>\n" +
            "<a>abc@algaworks.com</a><a>xyz@algaworks.com</a>" +
            "<strong>maria@algaworks.com</strong>";

        String regex = "[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}";

        //Passamos um regex e pelo que quer substituir
        String novoHtmlTrocandoApenasPrimeiroEmail = html.replaceFirst(regex, "email@anonimizado");
        //Passamos um regex e pelo que quer substituir
        String novoHtmlTrocandoTodosOsEmails = html.replaceAll(regex, "email@anonimizado");
        System.out.println(novoHtmlTrocandoTodosOsEmails);
    }
}
