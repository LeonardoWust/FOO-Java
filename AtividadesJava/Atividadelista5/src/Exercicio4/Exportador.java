package Exercicio4;
import java.util.List;
import java.util.Objects;

public interface Exportador {
    void exportar(List<String> cabecalho, List<List<Object>> linhas, String caminhoDoArquivo);
}
