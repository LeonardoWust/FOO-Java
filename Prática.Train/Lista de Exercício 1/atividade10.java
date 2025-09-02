import java.math.BigDecimal;
import java.util.Scanner;
public class atividade10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor monetario: ");
        BigDecimal valor1 = sc.nextBigDecimal();
        System.out.println("Digite outro valor monetario: ");
        BigDecimal valor2 = sc.nextBigDecimal();
        BigDecimal resultado = valor1.add(valor2);
        System.out.println("O resultado é: " + resultado);



        sc.close();
    }

}
