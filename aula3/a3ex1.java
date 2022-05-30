import java.util.Scanner;
public class a3ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2;
        String maior;
        System.out.print("Número 1: ");
        n1 = input.nextInt();
        System.out.print("Número 2: ");
        n2 = input.nextInt();
        maior = (n1 > n2 ? "Número 1 é maior" : "Número 2 é maior");
        System.out.print(maior);
        input.close();
    }
}
