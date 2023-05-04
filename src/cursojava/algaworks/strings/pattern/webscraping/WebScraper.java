package cursojava.algaworks.strings.pattern.webscraping;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebScraper {
    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">\n          joao@gmail.com    </a>\n" +
            "<a>abc@algaworks.com</a><a>xyz@algaworks.com</a>" +
            "<strong>maria@algaworks.com</strong>";

        // () = Captura de grupo no regex
        // String regex = "<strong>(.*)</strong>";
        // String regex = "<strong>([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})</strong>";
        // String regex = "<.*>([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})</.*>"; // Pega apenas o último correspondente do regex
        // Porque é um operador greed(ganancioso)
        // String regex = "<.*?>([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})</.*?>"; // Alteração para ele ser Reluctant(Teimoso)
        // String regex = "<.*?>\\s*([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>"; // Incluindo \\s para pegar espaços e quebras de linha
        String regex = "<.*?>\\s*(?<email>[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>"; // Nomeando grupo (não tem efeito na correspondencia)
        Pattern pattern = Pattern.compile(regex); // Precisamos compilar o regex antes de usalo
        Matcher matcher = pattern.matcher(html); // Vendo se o regex bate com o html com a instancia Matcher

        while (matcher.find()) { // find é tipo "localize o próximo"
            // System.out.println(matcher.group(1)); // Grupo que definimos na expressão regular, e ele começa no 1
            System.out.println(matcher.group("email")); // Grupo com a nomeação que colocamos
        }
    }
}
