import java.util.Scanner;
public class atividade3 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    double numero1 = sc.nextDouble();
    System.out.print("Digite outro número: ");
    double numero2 = sc.nextDouble();
    double vezes = numero1 * numero2;
    System.out.println("A divisão de " + numero1 + " e " + numero2 + " é: " + vezes);

    sc.close();
    }
}