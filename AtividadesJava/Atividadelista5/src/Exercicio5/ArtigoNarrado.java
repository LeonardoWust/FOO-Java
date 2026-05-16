package Exercicio5;

public class ArtigoNarrado implements Youtube {

    public ArtigoNarrado(String titulo, int duracao) {
    }


    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo artigo narrado: qualidade boa");
    }

    @Override
    public void duracao(int segundos) {
        System.out.println("Duração: 2 minutos");
    }

    @Override
    public int getDuracao(){
        return 3;
    }



}
