package Exercicio4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;

public class ExportadorCsv implements Exportador {
    @Override
    public void exportar(List<String> cabecalho, List<List<Object>> linhas, String caminhoDoArquivo) {

        StringBuilder csvBuilder = new StringBuilder();

        StringJoiner cabecalhoCsv = new StringJoiner(",");
        for (String titulo : cabecalho){
            cabecalhoCsv.add(titulo);
        }
        csvBuilder.append(cabecalhoCsv.toString()).append("\n");

        if (linhas != null){
            for (List<Object> linha : linhas) {
                StringJoiner linhaCsv = new StringJoiner(",");
                for (Object valor : linha) {
                    linhaCsv.add(valor != null ? valor.toString() : "");
                }
                csvBuilder.append(linhaCsv.toString()).append("\n");
            }
        }

        try {
            Files.writeString(Paths.get(caminhoDoArquivo), csvBuilder.toString());
        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo CSV: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
