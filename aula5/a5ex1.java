import java.util.Scanner;
public class a5ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, soma=0;
        System.out.print("Numero: ");
        n1 = input.nextInt();
        while(n1 >= 0){
            soma += n1; //SOMA = SOMA + N1
            System.out.print("Numero: ");
            n1 = input.nextInt();
        }
        System.out.printf("Somatorio: %d", soma);
        input.close();
    }
}
