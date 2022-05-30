import java.util.Scanner;
public class a5ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, n1, ft=1;
        System.out.print("Digite um número para fatorar: ");
        n1 = input.nextInt();
        input.close();
        for (i = 1; i <=n1; i++){
            ft*=i;
        }
        System.out.print(ft);
    }
}
