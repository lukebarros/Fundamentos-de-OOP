import java.util.Scanner;
public class a5ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, soma=0, media, count=0;
        System.out.print("Valor: ");
        n1 = input.nextInt();
        while (n1 > 0) {
            System.out.print("Valor: ");
            n1 = input.nextInt();
            if (n1 % 2 == 0){
                soma += n1;
                count++;
            }else if (n1 == 0)
                break; 
        }
        media = soma/count;
        System.out.printf("Média: %d", media);
        input.close();
    }
}