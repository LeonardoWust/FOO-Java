import java.util.Scanner;
public class atividade9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a raio do circulo: ");
        float raio = sc.nextFloat();
        double area = Math.PI * raio * raio;
        System.out.println("A area do circulo é: " + area);

        sc.close();
    }
}
