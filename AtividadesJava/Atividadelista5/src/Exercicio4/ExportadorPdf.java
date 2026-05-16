package Exercicio4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExportadorPdf implements Exportador {
    @Override
    public void exportar(List<String> cabecalho, List<List<Object>> linhas, String caminhoDoArquivo) {
        String conteudoPdfFalso = "Isso seria o conteúdo de um arquivo PDF gerado com os dados.";

        // A mesma lógica de salvar o arquivo diretamente.
        try {
            Files.writeString(Paths.get(caminhoDoArquivo), conteudoPdfFalso);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
