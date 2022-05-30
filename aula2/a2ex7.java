import java.util.Scanner;
public class a2ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float lado, areaTriangulo, areaCirculo, areaQuadrado, perimetro;
        System.out.print("Digite a medida de um dos lados da quadra: ");
        lado = input.nextFloat();
        areaTriangulo = (((lado * lado)*(float)Math.sqrt(3))/4);
        areaQuadrado = lado*lado;
        areaCirculo = (float) ((3.1415 * (lado/2)*(lado/2))/2);
        perimetro = (lado*4) + (2*(lado/2 * (float) 3.1415))/2;
        System.out.printf("A área da quadra é: %.2f metros", areaCirculo+areaQuadrado+areaTriangulo);
        System.out.printf("\nO perímetro da quadra é %.2f metros\n", perimetro);    
        input.close();
    }
}