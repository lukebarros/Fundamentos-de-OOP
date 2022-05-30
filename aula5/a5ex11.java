import java.util.Scanner;
public class a5ex11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1;
        System.out.print("Numero: ");
        n1 = input.nextInt();
        for (int tab = 0; tab <= 10; tab++){
            System.out.printf("%d * %d = %d\n", n1, tab, tab*n1);
        }
        input.close();
    }
}
