import java.util.Scanner;
public class a3ex3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n1, n2;
    String res;
    System.out.print("Número 1: ");
    n1 = input.nextInt();
    System.out.print("Número 2: ");
    n2 = input.nextInt();
    res = (n1 == n2 ? "Iguais": (n1 > n2 ? "Diferentes, Numero 1 é maior (n1: "+ n1 + ", n2: " + n2 + ")": 
    "Diferentes, Número 2 é maior (n2: "+ n2 + ", n1: " + n1 + ")"));
    System.out.print(res);
    input.close();
    }
}
