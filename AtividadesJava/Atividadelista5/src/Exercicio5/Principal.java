package Exercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Youtube> feed = new ArrayList<>();

        feed.add(new Podcast("aula de java", 10));
        feed.add(new Video("Comendo frango da macumba", 1000));
        feed.add(new ArtigoNarrado("Coisas fodas", 943));



        feed.sort(Comparator.comparingInt(Youtube::getDuracao));

        System.out.println("Feed Ordenado: " + feed);

        for (Youtube item : feed){
            item.reproduzir();
        }
    }
}
