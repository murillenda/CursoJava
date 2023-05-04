package cursojava.algaworks.strings.pattern.desafio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonScraper {
    public static void main(String[] args) {

        String json = """
            {
                "id": 1,
                "nome":"%s"
            },
            {
                "id": 2,
                "nome":"%s"
            },
            {
                "id": 3,
                "nome":"%s"
            }
            """.formatted(args[0], args[1], args[2]);

        String regexEstraiNomes = "\"nome\":*?(?<nome>\"[A-Za-zã]+[\\sA-Za-z]{0,99}+\")";
        Pattern pattern = Pattern.compile(regexEstraiNomes);
        Matcher matcher = pattern.matcher(json);

        while (matcher.find()) {
            System.out.println(matcher.group("nome"));
        }
    }
}
