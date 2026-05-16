package Exercicio5;

public class Podcast implements Youtube {

    public Podcast(String titulo, int duracao) {
    }



    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo podcast: qualidade de audio ótima");
    }

    @Override
    public void duracao(int segundos) {
        System.out.println("até a conversa acaba");
    }

    @Override
    public int getDuracao(){
        return 2;
    }
}
