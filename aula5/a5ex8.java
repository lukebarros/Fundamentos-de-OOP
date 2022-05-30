import java.util.Scanner;
public class a5ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, maior, menor;
        System.out.print("Digite um número: ");
        n = input.nextInt();
        maior = n;
        menor = n;
        for (int i = 0;i < 5;i++){
            System.out.print("Digite um número: ");
            n = input.nextInt();
            if (n > maior){
                maior = n;
            }
            else if (n < menor){
                menor = n;
            }
        }
        System.out.print("Maior: "+maior+"\nMenor: "+menor);
        input.close();
    } 
}