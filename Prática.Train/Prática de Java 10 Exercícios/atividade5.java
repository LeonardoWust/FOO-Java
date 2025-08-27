import java.util.Scanner;

public class atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Diga seu sobrenome: ");
        String sobrenome = sc.nextLine();
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Seu nome Ã©: " + nomeCompleto);

        sc.close();
    }
}