import java.util.Scanner;
public class a4ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float hrmes = 160, acresc = (float) 1.5, quantHr, salHr, salTotal;
        System.out.print("Digite o salário por hora: ");
        salHr = input.nextFloat();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        quantHr = input.nextFloat();
        if (quantHr > hrmes){
            salTotal = hrmes * salHr + ((quantHr - hrmes) * acresc * salHr);
            System.out.printf("Salário total: %.2f", salTotal);
        }
        else{
            salTotal = quantHr * salHr;
            System.out.printf("Salário total: %.2f", salTotal);
        }
        input.close();
    }
}
