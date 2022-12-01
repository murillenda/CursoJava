package cursojava.apache.apachePoi;

import cursojava.apache.Model.Pessoa;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApachePoiCriarArquivo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Murillo\\IdeaProjects" +
                "\\Curso Java\\src\\cursojava\\apache\\apachePoi\\arquivosApachePoi\\arquivoExcel.xls");

        if (!file.exists()) {
            file.createNewFile();
        }

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();

        pessoa1.setNome("Murillo");
        pessoa1.setEmail("giikthelol@gmail.com");
        pessoa1.setIdade(22);

        pessoa2.setNome("Murillo2");
        pessoa2.setEmail("sadsads@gmail.com");
        pessoa2.setIdade(23);

        pessoa3.setNome("Murillo3");
        pessoa3.setEmail("fggggggg@gmail.com");
        pessoa3.setIdade(19);

        pessoa4.setNome("Murillo4");
        pessoa4.setEmail("uuuuuuuu@gmail.com");
        pessoa4.setIdade(44);

        //Pode vir do banco de dados ou qualquer fonte de dados
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); //Vai ser usado para escrever na planiha
        HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento"); //Criar planilha

        int numeroLinha = 0;
        for (Pessoa p: pessoas) {
            Row linha = linhasPessoa.createRow(numeroLinha ++); //Criando linha na Planilha

            int celula = 0;
            Cell celNome = linha.createCell(celula++); //célula 1
            celNome.setCellValue(p.getNome());

            Cell celEmail = linha.createCell(celula++); //célula 2
            celEmail.setCellValue(p.getEmail());

            Cell celIdade = linha.createCell(celula++); //célula 3
            celIdade.setCellValue(p.getIdade());
        } //terminou de montar a planilha
        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida); //escreve planilha em arquivo
        saida.flush();
        saida.close();

        System.out.println("Planilha Criada com sucesso");
    }
}
