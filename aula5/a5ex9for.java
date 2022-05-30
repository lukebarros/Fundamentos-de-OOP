import java.util.Scanner;
public class a5ex9for {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float i, N, fat=1, E=0, x;
        System.out.print("Digite um número para fatorar: ");
        N = input.nextInt();
        input.close();
        for (i = 0; i <=N; i++){
            fat=1;
            for(x = i; x>=1;x--)
            fat*=x;
        }
        E = E+1/fat;
        System.out.print(E);
    }
    
}
