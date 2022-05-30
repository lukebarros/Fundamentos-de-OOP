import java.util.Scanner;
public class a2ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = input.nextInt();
        System.out.printf("A soma dos numeros é: %d", n1+n2);
        input.close();
    }
}
