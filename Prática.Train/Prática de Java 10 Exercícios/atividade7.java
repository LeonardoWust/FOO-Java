import java.util.Scanner;
public class atividade7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        System.out.println(nome.charAt(0)); //codigo para pegar a primeira letra da palavra

        sc.close();
    }
}
