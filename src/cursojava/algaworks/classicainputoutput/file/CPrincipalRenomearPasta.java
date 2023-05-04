package cursojava.algaworks.classicainputoutput.file;

import java.io.File;

public class CPrincipalRenomearPasta {
    public static void main(String[] args) {
        File pasta1 = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/docs");
        File pasta2 = new File("src/cursojava/algaworks/classicainputoutput/file/arquivos/documentos");

        // Método que dá rename na pasta e retorna um booleano dizendo se foi ou não renomeado
        System.out.println(pasta1.renameTo(pasta2));

        // Esse método também pode ser usado para mover arquivos dependendo do S.O que usa.
        // As vezes pode ser que não renomeie o arquivo também dependendo da situação do arquivo
        // Se o arquivo for somente leitura, por exemplo
        // ou se ele estiver sendo utilizado por outro processo
        // Ou questões de segurança
        // ou se tiver querendo fazer uma mudança de uma partição pra outra ou para um sistema de arquivos remoto
        // pode ser que não dê certo também
        // e essa operação NÃO É ATÔMICA
        // ou seja, existe a possibilidade de ela ser movida parcialmente para o destino e acontecer algum erro
        // no meio do caminho e ficar parte dos arquivos no camihno original e outra parte já movidos para o destino
        // Então não é tudo ou nada, pode dar merda com metade do serviço feito.
    }
}
