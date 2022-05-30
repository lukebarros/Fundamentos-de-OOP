import java.io.IOException;
import java.util.Scanner;

public class teste1 {
 
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
 
    int codigo = scan.nextInt();
    int quantidade = scan.nextInt();
        if (codigo == 1 ){
        System.out.printf("Total: R$ %.2f\n",(double)quantidade * 4.00);
    }else if (codigo == 2){
        System.out.printf("Total: R$ %.2f\n",(double)quantidade * 4.50);
    }else if (codigo == 3){
        System.out.printf("Total: R$ %.2f\n",(double)quantidade * 5.00);
    }else if (codigo == 4){
        System.out.printf("Total: R$ %.2f\n",(double)quantidade * 2.00);
    }else if (codigo == 5){
        System.out.printf("Total: R$ %.2f\n",(double)quantidade * 1.50);
    }

    }
 
}