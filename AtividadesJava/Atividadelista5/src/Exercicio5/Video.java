package Exercicio5;

public class Video implements Youtube {

    public Video(String titulo, int duracao) {
    }


    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo video: qualiade 4k ultra HD");
    }

    @Override
    public void duracao(int segundos) {
        System.out.println("Duração 2 horas");
    }

    @Override
    public int getDuracao(){
        return 1;
    }
}
