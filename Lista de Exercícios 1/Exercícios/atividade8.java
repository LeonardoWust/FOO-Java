import java.util.Scanner;
public class atividade8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Digite sua segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Digite sua terceira nota: ");
        int nota3 = sc.nextInt();
        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;
        System.out.println("Sua média é: " + media);

        sc.close();
    }
}
