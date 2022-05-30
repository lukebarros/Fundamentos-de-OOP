import java.util.Scanner;
public class a5ex10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, a1, r, n, an=0;
        System.out.print("Digite o número de termos da PA: ");
        n = input.nextInt();
        System.out.print("Digite o primeiro elemento da PA: ");
        a1 = input.nextInt();
        System.out.print("Digite a razão da PA: ");
        r = input.nextInt();
        input.close();
        for (i = 1; i <= n; i++){
            an+=a1;
            System.out.printf(a1 + "(%d)\n",i); 
            a1+=r;
        }
        System.out.print("Soma dos Elementos: "+an);
    }
}
