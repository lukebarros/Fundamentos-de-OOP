import java.util.Scanner;
public class a5ex9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float i, n1, ft=1, j=1;
        System.out.print("Digite um número para fatorar: ");
        n1 = input.nextInt();
        input.close();
        for (i = 1; i <=n1; i++){
            ft*=i;
            j+=(1/ft);
        }
        System.out.print(j);
    }
}