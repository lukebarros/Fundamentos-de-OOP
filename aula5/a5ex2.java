import java.util.Scanner;
public class a5ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, soma=0, media, count=0;
        System.out.print("Valor: ");
        n1 = input.nextInt();
        while(n1 >= 0){
            soma += n1; //SOMA = SOMA + N1
            count ++; //COUNT = COUNT + 1
            System.out.print("Valor: ");
            n1 = input.nextInt();
        }
        media = soma/count;
        System.out.printf("Média: %d", media);
        input.close();
    }
}