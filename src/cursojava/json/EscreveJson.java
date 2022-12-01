package cursojava.json;

import com.google.gson.*;
import cursojava.json.Model.Usuario;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.google.gson.JsonParser.parseReader;

public class EscreveJson {
    public static void main(String[] args) throws IOException {
        Usuario usuario1 = new Usuario();
        usuario1.setNome("fernando");
        usuario1.setCpf("23213");
        usuario1.setLogin("joao");
        usuario1.setSenha("123");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("sss");
        usuario2.setCpf("2222222");
        usuario2.setLogin("maluco");
        usuario2.setSenha("444");

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String jsonUser = gson.toJson(usuarios);

        System.out.println(jsonUser);

        FileWriter fileWriter = new FileWriter( "C:\\Users\\Murillo\\IdeaProjects" +
                "\\Curso Java\\src\\cursojava\\json\\arquivos\\filjson.json");

        fileWriter.write(jsonUser);
        fileWriter.flush();
        fileWriter.close();
        //-------------------------------------------LENDO O ARQUIVO JSON*****************---------------------

        FileReader fileReader = new FileReader("C:\\Users\\Murillo\\IdeaProjects" +
                "\\Curso Java\\src\\cursojava\\json\\arquivos\\filjson.json");

        JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader); //Separando json em posições separadas
        List<Usuario> usuariosList = new ArrayList<>();
        for (JsonElement jsonElement:jsonArray) {

            Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class); //Converte pra tipo Usuario
            usuariosList.add(usuario);
        }
        String converteListaPraJson = gson.toJson(usuariosList);
        System.out.println("Leitura do arquivo Json: " + converteListaPraJson);

    }
}
