import java.util.Scanner;
public class a4ex1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2, dist;
        System.out.print("Ponto 1: ");
        x1 = input.nextDouble();
        System.out.print("Ponto 2: ");
        y1 = input.nextDouble();
        System.out.print("Ponto 3: ");
        x2 = input.nextDouble();
        System.out.print("Ponto 4: ");
        y2 = input.nextDouble();
        dist = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        System.out.printf("A distância dos pontos é: %.2f", dist);
        input.close();
}
}