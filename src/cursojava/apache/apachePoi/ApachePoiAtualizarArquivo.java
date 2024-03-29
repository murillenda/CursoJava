package cursojava.apache.apachePoi;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class ApachePoiAtualizarArquivo {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Murillo\\IdeaProjects" +
                "\\Curso Java\\src\\cursojava\\apache\\apachePoi\\arquivosApachePoi\\arquivoExcel.xls");

        FileInputStream entrada = new FileInputStream(file);

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); //Prepara a entrada do arquivo xls excel
        HSSFSheet planilha = hssfWorkbook.getSheetAt(0); //Pegando Planilha

        Iterator<Row> linhaIterator = planilha.iterator(); //Linhas

        while (linhaIterator.hasNext()) { //Enquanto tiver linhas
            Row linha = linhaIterator.next(); //Dados da pessoa na linha

            int numeroCelulas = linha.getPhysicalNumberOfCells(); //Quantidade de celula

            String valorCelula = linha.getCell(0).getStringCellValue();//Valor da primeira celula
            linha.getCell(0).setCellValue(valorCelula + " * Valor gravado na aula");
        }
        entrada.close();

        FileOutputStream saida = new FileOutputStream(file);
        hssfWorkbook.write(saida);
        saida.flush();
        saida.close();

        System.out.println("Planilha Atualizada");
    }
}
