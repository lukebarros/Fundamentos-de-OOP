import java.util.Scanner;
public class a2ex9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double euro, dolar, real;
        System.out.print("Digite o valor(em reais) para conversão: ");
        real = input.nextDouble();
        euro = real/6.17;
        dolar = real/5.26;
        System.out.printf("Os valores convertidos são: %.2f dólares", dolar);
        System.out.printf(" e %.2f euros", euro);
        input.close();
    }
}
