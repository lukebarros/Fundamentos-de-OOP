import java.util.Scanner;
public class a2ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float temp;
        System.out.print("Digite a temperatura em Celsius: ");
        temp = input.nextFloat();
        System.out.printf("%.1f graus Farenheit",((9*temp + 160)/5));
        input.close();
    } 
}
