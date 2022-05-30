import java.util.Scanner;

public class teste2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int n;
        for (int i = 0; i < num; i++) {
            n = entrada.nextInt();
            if (n % 2 == 0) {
                System.out.println("output if PAR: " + 0);
            }else
                System.out.println("output if IMPAR: " + 1);
        }
    }
}