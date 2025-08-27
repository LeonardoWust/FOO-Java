import java.util.Scanner;
public class atividade4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Divisão");
        System.out.print("Digite um número:");
        int numero1 = sc.nextInt();
        
        System.out.print("Diigte outro número");
        int numero2 = sc.nextInt();
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " + " + numero2 + " é: " + resultado);
        


        sc.close();
    }
}