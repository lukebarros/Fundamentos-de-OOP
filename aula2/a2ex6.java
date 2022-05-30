import java.util.Scanner;
public class a2ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int comprimento, altura;
        System.out.print("Digite a altura do terreno: ");
        altura = input.nextInt();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = input.nextInt();
        System.out.printf("O perímetro do terreno é: %d metros", (comprimento*2 + altura*2));
        System.out.printf("\nA area do terreno é: %d", comprimento*altura);
        input.close();
    }
}
