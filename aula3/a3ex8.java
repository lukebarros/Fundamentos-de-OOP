import java.util.Scanner;
public class a3ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2;
        String res;
        System.out.print("Número 1: ");
        n1 = input.nextInt();
        System.out.print("Número 2: ");
        n2 = input.nextInt();
        res = (n1 % n2 == 0 ? "São multiplos":"Não são multiplos");
        System.out.print(res);
        input.close();
    }
}
