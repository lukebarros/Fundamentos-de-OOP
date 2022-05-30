import java.util.Scanner;
public class a3ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1,n2,n3, med;
        System.out.print("Digite a nota 1: ");
        n1 = input.nextFloat();
        System.out.print("Digite a nota 2: ");
        n2 = input.nextFloat();
        System.out.print("Digite a nota 3: ");
        n3 = input.nextFloat();
        med = (n1 + n2 + n3)/3;
        if (med >= 7)
            System.out.printf("Média final: %.1f \nAprovado(a)", med);
        else if (med >=4)
            System.out.printf("Média final: %.1f \nRecuperação", med );
        else 
            System.out.printf("Média final: %.1f \nReprovado(a)", med);
        input.close();
    }
}
