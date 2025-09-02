import java.util.Scanner;
public class atividade6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade < 18){
            System.out.println("Você é menor de idade otário");
        } else {
            System.out.println("Você é maior de idade parabens!!!!!");
        }
        sc.close();
    }
}
