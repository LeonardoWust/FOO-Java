import java.util.Scanner;
public class atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();
        int soma = numero1 + numero2;
        System.out.println(" A soma do " + numero1 + " e o " + numero2  +  " a soma é: "  +  soma);

        sc.close();
    }
}