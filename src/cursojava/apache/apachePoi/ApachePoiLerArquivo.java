package cursojava.apache.apachePoi;

import cursojava.apache.Model.Pessoa;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApachePoiLerArquivo {
    public static void main(String[] args) throws IOException {

        FileInputStream entrada = new FileInputStream(
                new File("C:\\Users\\Murillo\\IdeaProjects" +
                        "\\Curso Java\\src\\cursojava\\apache\\apachePoi\\arquivosApachePoi\\arquivoExcel.xls")
        );
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); //Prepara entrada do arquivo excel pra ler
        HSSFSheet planilha = hssfWorkbook.getSheetAt(0); //Pega a primeira planilha do arquivo excel

        Iterator<Row> linhaIterator = planilha.iterator();


        List<Pessoa> pessoas = new ArrayList<>();
        while(linhaIterator.hasNext()) {//Enquanto tiver linhas no arquivo do excel
            Row linha = linhaIterator.next(); //Dados da pessoa na linha

            Iterator<Cell> celula = linha.iterator();

            Pessoa pessoa = new Pessoa();
            while(celula.hasNext()) {//Percorrer as celulas
                Cell cell = celula.next(); //Celula atual

                switch (cell.getColumnIndex()) {
                    case 0:
                        pessoa.setNome(cell.getStringCellValue());
                        break;
                    case 1:
                        pessoa.setEmail(cell.getStringCellValue());
                        break;
                    case 2:
                        pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
                        break;
                }
            }//Fim das celulas da linha
            pessoas.add(pessoa);
        }
        entrada.close();
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
