import java.util.Scanner;
public class a3ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1,n2,n3,med;
        String res;
        System.out.print("Nota 1: ");
        n1 = input.nextFloat();
        System.out.print("Nota 2: ");
        n2 = input.nextFloat();
        System.out.print("Nota 3: ");
        n3 = input.nextFloat();
        med = (n1+n2+n3)/3;
        res = (med >= 6 ? "Aprovado" : "Reprovado");
        System.out.print(res);
        input.close();
    }
}
